package practice.test.stream.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /*Filter: stream 에서 특정 데이터만 걸러내는 메소드
        * 함수형 인터페이스인 Predicate 를 매개변수로 받음
        * */

        IntStream intStream = IntStream.range(0,10);

        intStream.filter(x->x%2==0).forEach(i-> System.out.print(i+ " "));
    }
}
