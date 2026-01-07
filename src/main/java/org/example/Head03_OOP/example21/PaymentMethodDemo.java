package org.example.Head03_OOP.example21;

public class PaymentMethodDemo {
    public static void main(String[] args) {
        for(PaymentMethod method : PaymentMethod.values()){
            System.out.println(method.name() + " => " + method.getPaymentName());
        }
    }
}
