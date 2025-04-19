package practice.basic.ch05;

import java.util.Arrays;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
for (int i = 0; i <=3; i++) {
    String[] season = {"spring", "summer", "fall","winter"};
    System.out.printf("season[%d]: ", i);
    System.out.println( season[i]);
}

        int[] scores = {83,90,87};
        System.out.println("총합: " + Arrays.stream(scores).sum());
        System.out.println("평균: " + Arrays.stream(scores).average().getAsDouble());
    }
}
