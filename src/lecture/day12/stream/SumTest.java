package lecture.day12.stream;

import java.util.Arrays;

public class SumTest {
    public static void main(String[] args) {
        int n = 1234;  // 각자리수를 더하는 문제
        // 각 자리수가 필요한 경우 문자열로 변환해서 split
        // String[]를 생성함.

        String[] split = String.valueOf(n).split("");
        // {"1","2","3","4"}

        //Stream으로 만들고 -> mapping(하나씩 int로 바꾸기) -> 집계처리 sum()
        long sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
