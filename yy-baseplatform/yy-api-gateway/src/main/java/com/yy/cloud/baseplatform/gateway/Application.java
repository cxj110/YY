package com.yy.cloud.baseplatform.gateway;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.hateoas.hal.Jackson2HalModule;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSidecar
public class Application {
    @Autowired
    private RepositoryRestMvcConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    @PostConstruct
    public void postConstructConfiguration() {
        restConfiguration.objectMapper().registerModule(new Jackson2HalModule());
    }
}
