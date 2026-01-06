package org.example.Head03_OOP.example07;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}