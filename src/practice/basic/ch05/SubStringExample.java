package practice.basic.ch05;

public class SubStringExample {
    public static void main(String[] args) {
        /*
         * SubString
         * - 원하는 범위만 잘라서 새로운 문자열 반환
         *
         * 인자가 1개일 때,
         * - 해당 index값에서 끝까지
         *
         * 인자가 2개일 때, (시작index, 끝index)
         * - 시작index부터 끝index 전까지
         * */

        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
        /*
         * split
         * 문자열을 특정 구분자를 기분으로 잘라서 문자열 배열로 반환
         *
         * String[] tokens = ssn.split("-")
         * tokens[0]
         * tokens[1]
         */
    }
}
