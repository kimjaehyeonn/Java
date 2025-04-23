package practice.basic.ch11.sec08;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateExample {
    public static void main(String[] args) {

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String datenow = sdf.format(now);
        System.out.println(datenow);
    }
}
