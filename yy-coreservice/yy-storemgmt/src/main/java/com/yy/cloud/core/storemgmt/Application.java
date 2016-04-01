package com.yy.cloud.core.storemgmt;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.yy.cloud.core.storemgmt.data.domain.Member;

@SpringBootApplication
@ComponentScan(basePackages = { "com.yy.storemgmt.config", "com.yy.storemgmt.data" })
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private RepositoryRestMvcConfiguration repositoryRestConfiguration;

	@PostConstruct
	public void postConstructConfiguration() {
		// repositoryRestConfiguration.objectMapper().registerModule(new
		// Jackson2HalModule());

		repositoryRestConfiguration.config().exposeIdsFor(Member.class);
	}
}
