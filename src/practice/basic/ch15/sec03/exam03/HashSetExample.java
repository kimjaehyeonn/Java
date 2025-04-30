package practice.basic.ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        System.out.println("========iterator 이용===========");
        // 1. Iterator
        Iterator<String> strItr = set.iterator();  // iterator 객체 생성
        while(strItr.hasNext()){
            System.out.println(strItr.next());
        }
        System.out.println("========foreach ==============");

        // 2. foreach
        for (String str : set) {
            System.out.println(str);
        }

    }
}
