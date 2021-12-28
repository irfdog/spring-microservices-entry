package com.example.ratingsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient not needed anymore
public class RatingsDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatingsDataServiceApplication.class, args);
    }

}
