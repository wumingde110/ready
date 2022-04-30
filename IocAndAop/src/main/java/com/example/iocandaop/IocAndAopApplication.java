package com.example.iocandaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller","aspect","service"})
public class IocAndAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(IocAndAopApplication.class, args);
    }

}
