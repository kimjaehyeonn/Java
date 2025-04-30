package lecture.day10.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 키+ 값의 쌍으로 넣어야 함(Entry)
        map.put("김길동", 95);
        System.out.println(map);
        map.put("홍길동", 95);
        System.out.println(map);

        // 값을 하나씩 꺼내는 방법
        // 1. key 목록을 가지고 값을 꺼내는 방법
        // 1-1. 키목록을 구해야 한다.
        Set<String> keys = map.keySet();
        System.out.println(keys);  // [김길동, 홍길동]
        // 1-2. 키를 하니씩 꺼내서 값을 구하자. foreach or iterator
        for (String key: keys) {
            System.out.println(map.get(key));   // map.get(key)
        }

        // 2. 엔트리 목록을 꺼내는 방법
    }
}
