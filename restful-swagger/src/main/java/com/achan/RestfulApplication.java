package com.achan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.achan")
public class RestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulApplication.class,args);
    }
}
