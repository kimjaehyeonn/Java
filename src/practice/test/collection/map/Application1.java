package practice.test.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /*
        Map
        -> Collection 인터페이스들과는 다른 저장방식
        key, value 쌍으로 저장하는 방식

        key란?
        - 값을 찾기 위한 이름 역할의 객체
        - key는 중복을 허용하지 않음, key가 다르면 중복되는 값은 저장 가능
        * */
        HashMap<String,String> hashMap = new HashMap();

        hashMap.put("1", "java8");
        hashMap.put("2", "oracle");
        hashMap.put("3", "jdbc");
        hashMap.put("4", "html5");
        hashMap.put("5", "css3");
        hashMap.put("6", "css3");
        hashMap.put("6", "css");

        System.out.println("hashMap :" + hashMap);   //  hashMap :{1=java8, 2=oracle, 3=jdbc, 4=html5, 5=css3, 6=css

        // key 값으로 삭제
        hashMap.remove(1);
        System.out.println("hashMap :" + hashMap);

        // getOrDefault(key, DefaultValue)
        // 지정한 key가 map에 없을때 기본값을 반환, 있다면 해당키의 value를 반환
        System.out.println("getOrDefault test: " + hashMap.getOrDefault("2","기본값"));
        System.out.println("getOrDefault test: " + hashMap.getOrDefault("10","기본값"));

        // Iterator로 key, value 출력
        System.out.println("-----set 이요햇 Iterator로 변환--------------");

        // keySet(): map에 저장된 모든 key를 set형태로 반환   map -> set
        Set<String> keys = hashMap.keySet();

        // iterator() -> iterator 객체 반환    set -> iterator
        Iterator<String> keyIter = keys.iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();

            // .get(key) : key값으로 value 꺼냄
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }

        // foreach문
        for (String key : keys){
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
