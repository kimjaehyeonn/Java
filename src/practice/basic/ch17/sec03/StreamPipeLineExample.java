package practice.basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 1. 단계별로 변수에 담아 처리

        // 1)  List<Student> -> Stream<Student>
        Stream<Student> studentStream = list.stream();

        // 2) Student 의 score 만 추출
        IntStream scoreStream = studentStream.mapToInt(x-> x.getScore());
        // Stream은 한번만 사용 가능. studentStream이미 사용해서 오류발생
//        IntStream scoreStream2 = studentStream.mapToInt(x-> x.getScore());


        // 3) 평균 계산(average()) 하고 Optional에서 double 값을 꺼냄
        double score =  scoreStream
                .average()  // 평균을 계산 OptionalDouble 반환
                // optional(없을 겨우에 대한 예외처리 )
                .orElseThrow(()-> new IllegalArgumentException("점수 없음"));

        System.out.println("평균 점수: " + score);


        // 2. 파이프라인스타일(체이닝)
        double avg2 = list.stream().mapToInt(s -> s.getScore()).average().orElse(0.0);
        System.out.println(avg2);


        // Stream.concat: stream 합치기
        Stream<Student> studentStream1 = list.stream();
        Stream<Student> studentStream2 = Stream.of(
                new Student("세종" , 40),
                new Student("광종" , 30)
        );
        Stream<Student> concatStudent = Stream.concat(studentStream1, studentStream2);
        concatStudent.forEach(student -> System.out.println(student));

    }

}
