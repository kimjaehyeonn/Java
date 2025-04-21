package practice.basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 타입 객체 선언
        Child child = new Child();

        // 부모타입 -> child를 업캐스팅 (자식을 부모타입으로 형변환)
        Parent parent = child; // 다형성
        
        parent.method1();  // parent-method1()
        parent.method2();  // child-method2() 자식에서 오버라이딩한 값 가져오기.
        //parent.method3();

    }
}
