package org.example.Head03_OOP.example03;

public class TestProgram {
    public static void main(String[] args) {
        Order order = new Order("1212", true, "EMAE");

        //order클래스에 생성된 변수값 가져오기
        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
        System.out.println(order.getNickname());


        //세팅값 변경 요청하기
        order.setOrderId("김김김");
        order.setIsPaid(false);
        order.setNickname("MAEMIN");

        //get을 통해 값을 가져오기
        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
        System.out.println(order.getNickname());
    }
}
