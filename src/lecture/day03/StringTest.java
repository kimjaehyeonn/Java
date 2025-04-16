package lecture.day03;

import java.sql.SQLOutput;

public class StringTest {
    public static void main(String[] args) {
        String s0 = null; // heap 영역에 값을 넣지 않음. 주소 없음.
        System.out.println(s0);  // null

        String s1 = "자바";
        String s2 = "자바";
        System.out.println(s1==s2);   // true

        String s3 = new String("자바"); // new 하면 힙영역에 주소 생김
        System.out.println(s1==s3);  // false

        System.out.println(s1.equals(s3)); // true


    }
}
