package com.idat.web.jersey.serverJersey;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@Path("/hello")
public class HelloWordController {
    @GET
    @Produces("text/plain")
    public String helloWorld() {
        return "Hola Mundo";
    }
}
