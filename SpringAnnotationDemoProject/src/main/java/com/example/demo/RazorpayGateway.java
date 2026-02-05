package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("razorpayGateway")
public class RazorpayGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("✅ Paid ₹" + amount + " using Razorpay (DEFAULT - @Primary)");
    }
}

