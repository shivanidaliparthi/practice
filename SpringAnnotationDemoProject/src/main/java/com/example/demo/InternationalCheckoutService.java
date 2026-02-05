package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InternationalCheckoutService {

    private final PaymentGateway paymentGateway;

    // Force PayPal for international payments
    public InternationalCheckoutService(@Qualifier("paypalGateway") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        System.out.print("InternationalCheckoutService -> ");
        paymentGateway.pay(amount);
    }
}
