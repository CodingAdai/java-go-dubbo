package com.example.springboot3dubbo3;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringBoot3Dubbo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3Dubbo3Application.class, args);
    }

}
