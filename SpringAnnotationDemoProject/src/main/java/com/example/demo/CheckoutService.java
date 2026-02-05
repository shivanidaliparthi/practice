package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    private final PaymentGateway paymentGateway;

    // No @Qualifier here → Spring will pick @Primary (RazorpayGateway)
    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        System.out.print("CheckoutService -> ");
        paymentGateway.pay(amount);
    }
}
