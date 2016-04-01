package com.yy.cloud.composite.webui.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yy.cloud.composite.webui.models.Member;

import java.util.List;

@FeignClient("usermgmt")
public interface MemberClient {

    @RequestMapping(method = RequestMethod.GET, value = "/members")
    PagedResources<Member> findAll();

    @RequestMapping(method = RequestMethod.GET, value = "/members/{id}")
    List<Member> findById(@RequestParam("id") String id);

    @RequestMapping(method = RequestMethod.POST, value = "/members",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    void createUser(@RequestBody Member user);

}
