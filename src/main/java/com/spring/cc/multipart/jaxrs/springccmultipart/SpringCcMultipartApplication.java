package com.spring.cc.multipart.jaxrs.springccmultipart;

import com.spring.cc.multipart.jaxrs.springccmultipart.api.TestMultipartController;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringCcMultipartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCcMultipartApplication.class, args);
    }

    @Component
    class JerseyConfig extends ResourceConfig {
        JerseyConfig() {
            register(MultiPartFeature.class);
            register(TestMultipartController.class);
        }
    }
}
