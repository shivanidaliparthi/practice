package com.example.demo;

import org.springframework.stereotype.Service;

@Service("paypalGateway")
public class PaypalGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("✅ Paid ₹" + amount + " using PayPal");
    }
}

