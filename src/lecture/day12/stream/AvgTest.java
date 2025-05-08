package lecture.day12.stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AvgTest {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int[] n2 = new int[0]; // 값이 없는 배열

        OptionalDouble result = Arrays.stream(n).average();
        //OptionalDouble result = Arrays.stream(n2).average();
        // 필드가 isPresent, value에 결과 내용을 넣어줌

        // 1. if 문 + isPresent()
        if (result.isPresent()) {
            System.out.println("평균은 " + result.getAsDouble());
        } else {
            System.out.println("평균 없음");
        }

        //2. orElse()
        double result2 =  Arrays.stream(n).average().orElse(0.0);
        System.out.println(result2);

        // 3. isPresent
        Arrays.stream(n).average().ifPresent(System.out::println);
    }
}
