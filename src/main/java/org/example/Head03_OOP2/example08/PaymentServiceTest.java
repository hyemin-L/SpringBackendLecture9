package org.example.Head03_OOP.example08;

public class PaymentServiceTest{
    public static void main(String[] args) {
        //UserAccount 객체 생성
        UserAccount account = new UserAccount("ACC001");

        //PaymentService 객체 생성
        PaymentService service = new PaymentService();


        // 정상 입금 테스트
        account.deposit(10000);
        System.out.println("초기 입금 완료. 잔액 : "+account.getBalance());

        //System.out.println으로 잔액 조회


        // 1. 음수 입금 테스트
        try {
            account.deposit(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 (음수 입금): " + e.getMessage());
        }

        // 2. 음수 출금 테스트
        try {
            service.processPayment(account, -3000);

        } catch (IllegalStateException e) {
            System.out.println("예외 발생 (음수는 출금을 못합니다): " + e.getMessage());

        }

        // 3. 잔액 부족 출금 테스트
        try {
            service.processPayment(account, 50000);

        } catch (IllegalStateException e) {
            System.out.println("예외 발생(잔액 부족): "+e.getMessage());
        }

        // 4. 정상 결제
        service.processPayment(account, 3000);
        // 5 정상 환불
        service.processRefund(account, 3000);

    }
}