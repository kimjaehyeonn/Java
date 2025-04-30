package lecture.day10.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        String s = "bbbaaacdddefecge";
        // a b c d e f g
        // s에 들어 있는 문자를 하나씩 꺼내서 hashset에 넣는다. 중복 제거

        Set<String>  set = new HashSet<>();
        String[] s2 = s.split("");
        // { "b", "b", "b" , "a" ,...}
        // 배열로 정렬 먼저 하면 편할 것 같음.
        Arrays.sort(s2); // { "a", "a" ,...}
        for ( String element: s2) {
            set.add(element); // 중복은 set에서 자동으로 걸러줌
        }
        System.out.println(set);  // 참조형 변수 프린트 -> 패킺.클래스명@해시코드
        // toString() 메서드가 재정의 -> set에 있는 목록을 문자열로 만들어주 는 것.
        //[a, b, c, d, e, f, g]

        // set을 하나씩 꺼낼 때 사용하는 방법 2가지
        // 1. foreach문
        for (String see : set ) {
            System.out.print(see+ " ");
        }
        System.out.println("--------------");
        // 2. 반복자(iterator)
        Iterator<String> iterator = set.iterator();
        // 있는지 없는지 체크한 다음, 있으면 하나씩 꺼내오는 방식
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
