package org.example.Head03_OOP.example03;

public class Order {
    private String orderId;
    private boolean isPaid;
    private String nickname;

    public Order(){
        this.orderId = "NONE";
        this.isPaid = false ;
        this.nickname = "NICKNAME";
    }

    public Order(String orderId, boolean isPaid, String nickname){
        this.orderId = orderId;
        this.isPaid = isPaid;
        this.nickname = nickname;
    }

    public String getOrderId(){
        return this.orderId;
    }

    public boolean getIsPaid(){
        return this.isPaid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setOrderId(String orderId){
        this.orderId=orderId;
    }

    public void setIsPaid(boolean isPaid){
        this.isPaid=isPaid;
    }

    public void setNickname(String nickname){
        this.nickname=nickname;
    }

}
