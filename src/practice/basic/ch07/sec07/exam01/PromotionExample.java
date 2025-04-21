package practice.basic.ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        /*
        * 다형성
        * - 하나의 인스턴스(객체)가 여러가지 타입을 가질 수 있음
        * - 하나의 타입으로 여러 타입의 인스턴스를 처리 할 수 있게도 하고
        * - 하나의 메소들 호출로 각기 다른 방법으로 동작하게 할 수 있다.
        * */

        /*
        *       A
        *      / \
        *     B   C
        *    /     \
        *   D       E
        * */


        A a = new A();
        B b = new B();   // A
        C c = new C();   // A
        D d = new D();   // A - B
        E e = new E();   // A - C

        // 업 캐스팅
        // 자식 -> 부모로 대입시 자동 타입 형변환.
        // 원래 자식이 갖고 있는 거 말고는 잃을게 없기에/안전하기에 자바에서 자동으로 해줌
        A a1 = b; // new B():  B의 고유한 값x, A에게 상속받은 값만 전달.
        A a2 = c; // new C();
        A a3 = d; // new D();
        A a4 = e; // new E();
        B b1 = d; // new D();
        C c1 = e; // new E();

        // E는 C의 자식 -> B와 관계 X
        // B b3 = e; // new E();
        A a5 = new E();
        B b2 = (B)a5;

        // D는 B의 자식 -> C와 관계 X
        // C c2 = d; // new D();

        // 다운 캐스팅
        // 부모 -> 자식
        B b4 = (B)a; // 불안정해서 잘 사용x

        Object o = new B();
    }
}
