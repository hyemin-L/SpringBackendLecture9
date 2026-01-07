package org.example.Head03_OOP.example21;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일결제");

    private final String payment;

    PaymentMethod(String payment){
        this.payment=payment;
    }

    public String getPaymentName(){
        return payment;
    }

}
