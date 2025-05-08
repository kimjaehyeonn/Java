package practice.advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is Java");
        list1.add("i am the best developer");

        /*
        list1.stream().reduce((a,b,...) -> String.join())
            람다 표현식에서 매개변수 개수는 고정!
            - (a, b, ...) 같이 **가변인자(...)**를 reduce의 람다에 직접 쓸 수 없음!
            - reduce는 항상 이진 연산자: (a, b) -> ... 형태여야 합니다.
        */

        // flatmap 사용
        list1.stream().map(x -> x.split(" "))   // String[]이 Stream<String[]>로 나옴
                .flatMap(Arrays::stream).forEach(System.out::println);     // Stream<String>으로 평탄화

        // collectors 사용
        Arrays.stream(list1.stream().collect(Collectors.joining(" ")).split(" ")).forEach(System.out::println);

        System.out.println();

        List<String> list2 = Arrays.asList("10,20,30", "40,50");
        list2.stream().map(x -> x.split(",")).flatMap(Arrays::stream).forEach(System.out::println);


    }
}
