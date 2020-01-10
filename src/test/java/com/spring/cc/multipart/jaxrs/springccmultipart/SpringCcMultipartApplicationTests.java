package com.spring.cc.multipart.jaxrs.springccmultipart;

import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.ws.rs.client.WebTarget;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = SpringCcMultipartApplication.class)
class SpringCcMultipartBase {

    protected static WebTarget webTarget;

    @LocalServerPort
    protected  int port;

    @BeforeEach
    public void setup(){
        webTarget = JerseyClientBuilder.createClient().target("http://127.0.0.1:"+port);
    }

}
