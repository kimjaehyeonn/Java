package practice.basic.ch06.sec08.exam01;

public class Calculator {
    protected int plus(int x, int y) {
        return x + y;
    }

    protected double divide(double x, double y) {
        return x / y;
    }

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
