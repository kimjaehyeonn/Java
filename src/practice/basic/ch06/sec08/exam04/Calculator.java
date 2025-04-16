package practice.basic.ch06.sec08.exam04;

public class Calculator {

    protected int areaRectangular(int... values) {
        if (values.length == 1) {
            return values[0] * values[0];
        } else if (values.length == 2) {
            int a = 1;
            for (int i = 0; i < values.length; i++) {
                a *= values[i];
            }
            return a;
        }
        else {return 0;}
    }


}
