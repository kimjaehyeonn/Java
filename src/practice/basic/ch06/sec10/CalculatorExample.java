package Java.src.practice.basic.ch06.sec10;

public class CalculatorExample {
    public static void main(String[] args) {
        double pi = Calculator.pi;
        System.out.println(pi);

        Calculator cal1 = new Calculator();
        cal1.z = 10;
        System.out.println(cal1.z);
        cal1.pi = 15;

        Calculator cal2 = new Calculator();
        cal2.z = 20;
        System.out.println(cal2.z);
        System.out.println("calc2.pi=" + cal2.pi); // 15. cal1,cal2는 Calculator.pi를 공유 중


        // 인스턴스를 만들지 않아도 클래스이름."" 으로 참조할 수 있음.
        // System.out.println(Calculator.plus((int)pi, 5));


        double result1 = 10 * 10 * Calculator.pi / 2;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
