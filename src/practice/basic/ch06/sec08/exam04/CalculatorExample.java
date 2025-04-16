package practice.basic.ch06.sec08.exam04;


import org.w3c.dom.ls.LSOutput;

public class CalculatorExample {

    public static void main(String[] args) {

        Calculator myCalcu = new Calculator();

        double result1 = myCalcu.areaRectangular(10);
        double result2 = myCalcu.areaRectangular(10, 20);
        System.out.println("정사각형의 넓이= " + result1);
        System.out.println("직사각형의 넓이= " + result2);
    }



}
