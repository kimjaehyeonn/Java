package practice.test.base.Date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        // Date 연도 설정 문제
        Date legacyDate = new Date();
        legacyDate.setYear(2025);

        System.out.println(legacyDate); // Fri Apr 24 15:26:04 KST 3925 // 1900이 더해져서 출력

        //Calendar 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println(cal.getTime()); //Sat May 24 15:26:04 KST 2025

    }
}
