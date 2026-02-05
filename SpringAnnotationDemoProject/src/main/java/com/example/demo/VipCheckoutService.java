package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VipCheckoutService {

    private final PaymentGateway paymentGateway;

    // Force Stripe for VIP payments
    public VipCheckoutService(@Qualifier("stripeGateway") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        System.out.print("VipCheckoutService -> ");
        paymentGateway.pay(amount);
    }
}

