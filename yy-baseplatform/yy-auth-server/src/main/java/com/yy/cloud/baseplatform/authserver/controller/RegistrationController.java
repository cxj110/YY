package com.yy.cloud.baseplatform.authserver.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yy.cloud.baseplatform.authserver.auth.AcmeUser;
import com.yy.cloud.baseplatform.authserver.repository.UserRepository;
import com.yy.cloud.baseplatform.authserver.service.ActivationService;
import com.yy.cloud.baseplatform.authserver.service.Registration;
import com.yy.cloud.baseplatform.authserver.service.RegistrationService;

/**
 * Controller exposing HTTP endpoints for new user registration and activation
 */
@RestController
class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ActivationService activationService;

    /**
     * Normally we would register the new user and email that user their activation key.  But to
     * keep this demo a little simpler we will just send the activation code back
     * @param email - the email of the new user
     * @param password - the password of the new user
     * @param firstName - the first name of the new user
     * @param lastName - the last name of the new user
     * @return the activation code needed to complete the registration and activate the user
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestBody Registration registration) throws JsonProcessingException{
        AcmeUser acmeUser = userRepository.findOneByEmail(registration.getEmail());
        if(acmeUser != null){
            return new ResponseEntity<String>("e-mail address already in use", HttpStatus.BAD_REQUEST);
        }
        else {
            String activationKey = registrationService.registerUser(registration);
            Map<String, String> activationMap = new HashMap<>();
            activationMap.put("registrationKey", activationKey);
            ObjectMapper mapper = new ObjectMapper();
            return new ResponseEntity<String>(mapper.writeValueAsString(activationMap), HttpStatus.CREATED);
        }
    }

    /**
     * Activates the user with the given key
     *
     * @param activationKey - the activation key
     */
    @RequestMapping(value = "/activate")
    public void activateUser(@RequestParam("key") String activationKey) {
        activationService.activateUser(activationKey);
    }

}
