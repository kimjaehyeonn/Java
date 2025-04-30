package practice.test.collection.list;

import java.time.LocalDateTime;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
         * Collection 프레임워크는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현함
         *
         * List 인터페이스
         * - 순서 O , 중복 O
         * - Vector, ArrayList, LinkedList, Stack, Queue\
         *
         * Set 인터페이스
         * - 순서 x, 중복 x
         * - HashSet, TreeSet
         *
         * Map 인터페이스
         * - (key,value) 쌍으로 이루어진 데이터 집합
         * - 순서 x, 중복 key x
         * - HashMap, TreeMap, HashTable, Properties
         * */

        // 가변적이고 요소의 추가/수정/삭제를 메소드로 제공해줌.
        ArrayList<Object> alist = new ArrayList<>();
        List<Object> list = new ArrayList<>(); // 다형성 위해

        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        System.out.println(list); // toString() 오버라이딩 되어 있음

        System.out.println("list의 크기: " + list.size()); // 요소 개수 반환

        //.add(index, element)
        list.add(1, "banana");
        System.out.println(list);

        //,set(index, replacement)
        list.set(1, true);
        System.out.println(list);

        //.remove(index)
        list.remove(1);
        System.out.println(list);

        List<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("d");
        strList.add("a");
        strList.add("b");
        Collections.sort(strList);   // Collections 클래스 안에 sort() static 메서드로 list 정렬.
        System.out.println(strList);
        Collections.reverse(strList);
        System.out.println(strList);

        /*
         * Iterator (반복자)
         * -> Collection 인터페이스의 iterator() 메소드를 이용해서 생성 가능
         * -> collection 에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용
         * */

        Iterator<String> iterator = strList.iterator();    // Iterator 객체 생성
        /*
         * hasNext(): 다음 요소가 남아 있으면 true, 없으면 false
         * next(): 현재 요소의 다음요소로 이동시키고 그 요소를 반환.
         * */
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        /*
        LinkedList
        - 저장한 요소가 순서를 유지하지 않고 젖아됨
        - 요소들 사이를 링크로 연결하여 구성해 마치 연결된 리스트처럼 만듦.
        - 저장과 삭제가 빈번하게 이루어지는 경우 성능면에서 ArrayList보다 우수.
        *
        * */
        List<String> strList1 = new LinkedList<>();


    }
}
