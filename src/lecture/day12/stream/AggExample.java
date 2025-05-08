package lecture.day12.stream;

import java.util.Arrays;

public class AggExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 순서 스트림으로 만들기 -> 필터링 -> 매핑 -> 집계
        //1. 개수
        long count = Arrays.stream(arr).filter(n-> n%2 ==0).count(); // count 는 long
        System.out.println("짝수 개수" + count);

        //2. 합계
        long sum = Arrays.stream(arr).filter(n-> n%2 ==0).sum(); // sum 은 long
        System.out.println("짝수 총합" + sum);

        //3. 평균
        // average()까지 하면 return type이 OptionalDouble
        // 결과가 있으면 꺼내오고, 없으면 기본값으로 설정가능함.
        double avg = Arrays.stream(arr).filter(n-> n%2 ==0).average().getAsDouble(); // average 는 Opitonaldouble
        System.out.println("짝수 개수" + count);

        /*stream에서는 sum(), count()이외에는
        * 결과값이 없을 수도 있기 때문에
        * 있을 때는 꺼내오고, 없을 때는 기본값을 설정할 수 있는
        * 타입인 Optional~~ 타입이 리턴됨
        * 있는 경우 해당 결과 값을 꺼내고 싶으면 한번 더
        * 메서드(.getAsXxx();)를 써서 결과값을 꺼내 주어야 함.
        *  */



        //4. 최댓값
        int max = Arrays.stream(arr).filter(n-> n%2 ==0).max().getAsInt(); // count 는 l
        System.out.println("짝수 최댓값" + max);
        //5. 최솟값
        int min = Arrays.stream(arr).filter(n-> n%2 ==0).min().getAsInt(); // count 는 l
        System.out.println("짝수 최솟값" + min);
    }
}
