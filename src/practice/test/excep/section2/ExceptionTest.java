package practice.test.excep.section2;

public class ExceptionTest {
    public void checkEnoughMoney ( int price, int money)throws Exception {
        // 가격이 음수일 때
        // 가지고 있는 돈이 음수일 때
        // 가지고 있는 돈이 부족할 때
        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다!");
        } else {
            throw new Exception();
        }
    }
}
