package practice.advanced.ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {

        /*TreeSet 특징
        * - 자동 정렬 유지: 요소를 추가하면 내부에서 compareTo 또는 생성자에 넘긴 Comparator 에 따라
        *                 적절한 위치에 삽입 위치 항상 오름차순 또는 comparator 기준으로 정렬됨
        * - 중복 불가
        * - null 금지
        * */

        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("hong", 35));
        treeSet.add(new Person("kim", 25));
        treeSet.add(new Person("park", 31));

        for ( Person p : treeSet) {
            System.out.println(p.name + ":"+ p.age);
        }

    }
}
