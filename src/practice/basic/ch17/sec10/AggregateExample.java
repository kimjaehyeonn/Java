package practice.basic.ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};

        // 2의 배수 카운팅
        Arrays.stream(arr).filter(x-> x%2==0).forEach(s-> System.out.print( s+ " "));
        System.out.println();

        //2의 배수 총합
        System.out.println(Arrays.stream(arr).filter(x-> x%2==0).sum());

        //2의배수 평균
        System.out.println(Arrays.stream(arr).filter(x-> x%2==0).average().orElse(0.0));

        //2의 배수중 최댓값
        System.out.println(Arrays.stream(arr).filter(x-> x%2==0).max().getAsInt());

        // 2의 배수중 최솟값
        System.out.println(Arrays.stream(arr).filter(x-> x%2==0).min().getAsInt());

        // 첫번재 3의 배수
        System.out.println(Arrays.stream(arr).filter(x->x%3==0).findFirst().getAsInt());
    }
}
