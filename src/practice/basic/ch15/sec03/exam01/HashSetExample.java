package practice.basic.ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBatis");

        // 객체 수 출력
        System.out.println("총객체수: "+ set.size());
        /*
        * 결과
        * 총객체수 : 4
        * set은 데이터의 중복이 허용되지 않기 때문이다. */
    }
}
