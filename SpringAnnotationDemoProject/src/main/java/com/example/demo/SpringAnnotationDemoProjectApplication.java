package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAnnotationDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAnnotationDemoProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner runDemo(
            CheckoutService checkoutService,
            InternationalCheckoutService internationalCheckoutService,
            VipCheckoutService vipCheckoutService) {

        return args -> {
            System.out.println("----- SPRING ANNOTATION DEMO START -----");

            checkoutService.checkout(1000);               // @Primary -> Razorpay
            internationalCheckoutService.checkout(2500);  // @Qualifier -> PayPal
            vipCheckoutService.checkout(5000);            // @Qualifier -> Stripe

            System.out.println("----- SPRING ANNOTATION DEMO END -----");
        };
    }
}

