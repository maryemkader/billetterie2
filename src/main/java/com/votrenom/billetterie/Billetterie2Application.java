package com.votrenom.billetterie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "com.votrenom.billetterie",
    "controller",
    "service",
    "repository",
    "model"
})
@EntityScan(basePackages = "model")
@EnableJpaRepositories(basePackages = "repository")
public class Billetterie2Application {

    public static void main(String[] args) {
        SpringApplication.run(Billetterie2Application.class, args);
    }
}