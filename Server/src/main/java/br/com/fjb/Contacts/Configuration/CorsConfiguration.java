package br.com.fjb.Contacts.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    //Hosts altorizados a consumir a API.
    String[] HOSTS = new String[]{"http://localhost:3000"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("CONNECTION ENABLED HOST:");
        for (String host : HOSTS) {
            registry.addMapping("/**")
                    .allowedOrigins(host)
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
            System.out.println(host);
        }
    }
}
