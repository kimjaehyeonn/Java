package practice.basic.ch07.sec03;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("iphone", "white");

        /*
        * 상속
        * - 부모가 가지고 잇는 재산(멤버)를 자식이 물려받음을 의미
        * - 단순히 물려받는 것보다, 자바에서는 확장의 개념
        * - 물려받은 것 + a 가능.
        * */

        //Phone(String model, String color)생성자 실행
        System.out.println("p.color = " + p.color);
        System.out.println("p.model = " + p.model);
        p.printModel();

    }
}
