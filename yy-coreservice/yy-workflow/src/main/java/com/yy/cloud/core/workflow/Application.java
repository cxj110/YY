package com.yy.cloud.core.workflow;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.yy.cloud.core.workflow.data.domain.Member;


@SpringBootApplication
@ComponentScan(basePackages = { "com.yy.workflow.config", "com.yy.workflow.data" })
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class Application {

	@Autowired
	private RepositoryRestMvcConfiguration repositoryRestConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	@PostConstruct
	public void postConstructConfiguration() {
		// repositoryRestConfiguration.objectMapper().registerModule(new
		// Jackson2HalModule());

		repositoryRestConfiguration.config().exposeIdsFor(Member.class);
	}
/*
    @Bean
    public ResourceProcessor<Resource<User>> movieProcessor() {
        return new ResourceProcessor<Resource<User>>() {
            @Override
            public Resource<User> process(Resource<User> resource) {

                resource.add(new Link("/movie/movies", "movies"));
                return resource;
            }
        };
    }*/
}
