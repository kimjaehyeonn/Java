package Java.src.practice.basic.ch06.sec10;

public class Calculator {
    static  double pi = 3.14;
//    static final double pi = 3.14; final 하면 상수
    int z;

    public static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "z=" + z +
                '}';
    }
}
