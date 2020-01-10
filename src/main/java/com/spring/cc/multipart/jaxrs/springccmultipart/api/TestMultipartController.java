package com.spring.cc.multipart.jaxrs.springccmultipart.api;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;

@Slf4j
@RestController
@Path("/")
public class TestMultipartController {


    @POST
    @Path("/multipart")
    @Consumes("multipart/*")
    @Produces("application/json")
    public ResponseObject sendWithMultipart(@FormDataParam("file") byte[] file) {

        log.info("Received request to send event to service: {}", file);
        assert file != null;
        return new ResponseObject().setResult("success");
    }

    @GET
    public String greeting(){
        return "Hi!";
    }

    @Data
    @Accessors(chain = true)
    private class ResponseObject {
        private String result;
    }
}
