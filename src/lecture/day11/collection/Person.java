package lecture.day11.collection;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 정렬, 비교할 때
    // 자동으로 이 함수를 이용함.
    // 이 클래스의 객체 생성해서 모앗을 때
    // 정렬기준을 정해줌.
    // age가지고 정렬할 때 사용함이라고 설정함.
    @Override
    public int compareTo(Person o) {
        if(age<o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;
    }
}

