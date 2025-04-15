package lecture.day02.test;

public class CastingTest {
    public static void main(String[] args) {
        // 기본형끼리 가능
        // 문자열변수를 기본형 변수로 X && 기본형 변수를 문자열 변수로 X

        byte age= 127;
        int age2 = age;  //4바이트 <- 자동으로 형변환(자동형변환) -- 1바이트

        byte age3 = (byte)age; // 1바이트 < -- 강제형변환 - 4바이트

        //기본형끼리의 타입변환은 큰지 작은지만 판단하면 가능

        //<input name ="age" value= "100">  ---> String으로 인식!

        // 문자열을 숫자로 Integer.parseInt()
        String data = "100"; // 입력데이터는  String으로 인식함.
        int num = Integer.parseInt(data); // int는 기본형, String은 참조형.
        System.out.println("내년 나이는 " + (num+1)); //101
        //Double.parseDouble()
        String data2 = "11.11";
        double num2 = Double.parseDouble(data2);

        //숫자를 문자열로
        String data3 = String.valueOf(num2);

    }
}
