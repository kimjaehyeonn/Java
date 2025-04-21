package practice.basic.ch07.sec04;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        if (r != 2) {
            return Math.PI * r * r;
        } else {
            return super.areaCircle(r);   // 부모의 메서드 그대로 사용.

        }
    }
}
