package com.yy.cloud.baseplatform.authserver.service;

import lombok.Data;

@Data
public class Registration {

    private String password;
    private String firstName;
    private String lastName;
    private String email;

}
