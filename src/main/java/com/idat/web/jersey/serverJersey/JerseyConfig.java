package com.idat.web.jersey.serverJersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(HelloWordController.class);
        register(SecurityFilter.class);
    }
}
