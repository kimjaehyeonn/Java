package Java.src.practice.basic.ch05;

import java.util.Arrays;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[]arr = {84,90,96};
        System.out.println("평균: " +Arrays.stream(arr).average().getAsDouble());
        System.out.println("총합: " + Arrays.stream(arr).sum());
    }
}
