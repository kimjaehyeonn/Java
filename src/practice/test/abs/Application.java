package practice.test.abs;

public class Application {
    public static void main(String[] args) {
        /*
        * 추상 클래스
        * - 추상메소드를 0개 이상 포함하는 클래스
        * - abstract 키워드를 사용해서 선언
        * - 직접 인스턴스를 생성 불가(new로 객체 생성 불가)
        * - 하위 클래스가 상속받아 구현해야 사용 가능
        * -> 다형성 활용 가능
        *
        * 추상 메서드
        * - 메소드 선언부만 있고 구현부는 없는 메소드
        * - 반드시 abstract 키워드를 붙여야 함
        * - ex) public abstract void method();
        * -> 하위(자식) 클래스는 반드시 오버라이딩 해야한다.
        * */

        // Product product = new Product(); 추상 클래스는 인스턴스 생성불가.
        SmartPhone sm = new SmartPhone();
        sm.abstMethod();

        // instance of: 특정 클래스나 인터페이스의 인스턴스 여부를 검사하는데 사용되는 연산자
        System.out.println(sm instanceof SmartPhone); // true
        System.out.println(sm instanceof Product);    // true\

        Product product = new SmartPhone();  // type casting

        // 동적 바인딩
        product.abstMethod();

        // static method
        Product.StaticMethod();

        product.nonStaticMethod();
    }
}
