package practice.basic.ch02;

public class StringConcatExample   {
    public static void main(String[] args) {
        int result1 = 10+2+8;
        System.out.println("result1:" + result1);

        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2); //128 숫자가 먼저와서

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4); // 1028 문자열이 먼저오면 그 다음 숫자들 다 문자열로 붙음

        String result5 = "10" + (2+8);
        System.out.println("result5: " + result5);


    }
}
