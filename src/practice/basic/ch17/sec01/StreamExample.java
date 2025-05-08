package practice.basic.ch17.sec01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
/*
*  스트림: 컬렉션, 배열같이 자바에서 데이터 소스를 편하게 다루기 위한 문법
*
* 스트림 구조
* 스트림객체 -> 중간 연산 -> 최종연산
*
* 스트림 특징
* 1. 원본데이터 변경 x
* 2. 일회용이기에 최종연산 이후 재생성 후 사용
* 3. 작업을 내부적을 반복처리
* 4. 병렬처리 가능
* */

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        System.out.println("----------- 향상된 for문 ----------");
        for (String s: set) {
            System.out.println(s);
        }

        System.out.println("----------stream 사용------------");
        Stream<String> stream = set.stream();
        stream.forEach(x-> System.out.println(x));

        // set 내부에서 foreach 있음.
        System.out.println("------set.forEach()----------");
        set.forEach(x -> System.out.println(x));


        set.stream()
                //.sorted() 사전 순 정렬
                .sorted(Comparator.reverseOrder())  // 역순 정렬
                .limit(2) // 앞에서 크기만큼 자르기
                .forEach(x-> System.out.println(x));
    }
}
