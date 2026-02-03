package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FieldInjectionDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(FieldInjectionDemoApplication.class, args);

        MobilePhone phone = context.getBean(MobilePhone.class);
        phone.makeCall();
    }
}
