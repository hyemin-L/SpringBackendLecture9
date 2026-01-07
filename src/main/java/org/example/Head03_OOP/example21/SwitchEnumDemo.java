package org.example.Head03_OOP.example21;

public class SwitchEnumDemo {
    public static void main(String[] args) {
        PaymentMethod method = PaymentMethod.CREDIT_CARD;

        // switch-case로 enum 처리
        switch (method) {
            case CREDIT_CARD:
                System.out.println("신용카드 결제 선택: " + method.getPaymentName());
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("계좌이체 결제 선택: " + method.getPaymentName());
                break;
            case MOBILE_PAYMENT:
                System.out.println("모바일 결제 선택: " + method.getPaymentName());
                break;
        }

        // 컴파일 오류 확인: enum에 없는 값은 case에 포함될 수 없음
        // 메서드 호출 시 타입 지정 오류로 컴파일 단계에서 에러 발생 🎯
    }
}