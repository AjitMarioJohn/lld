package com.parking.lot.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.parking.lot.infrastructure",
        "com.parking.lot.core",
        "com.parking.lot.presentation"
})
@EnableJpaRepositories(basePackages = {"com.parking.lot.infrastructure.repositories"})
@EntityScan(basePackages = {"com.parking.lot.infrastructure.entities"})
@EnableWebMvc
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
