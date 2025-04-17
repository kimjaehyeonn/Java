package Java.src.practice.basic.ch05;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {


        static void printItem(int[] x ) {
            for (int i = 0; i < x.length; i++) {
            System.out.printf("scores[%d]:" + x[i]+ "\n", i);
            }

        }
    public static void main(String[] args) {

        int[] scores = {83,90,87};
        printItem(scores);

    }
}
