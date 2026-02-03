package com.example.demo;

import org.springframework.stereotype.Service;

@Service("stripeGateway")
public class StripeGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("✅ Paid ₹" + amount + " using Stripe (VIP)");
    }
}
