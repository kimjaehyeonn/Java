package practice.basic.ch07.sec10.lecture;

public abstract class Product {
    private int nonStaticField;
    private static int StaticField;

    // 생성자
    public Product() {
    }

    // 추상 메서드 - 구현부x
    public abstract void abstMethod();

    //그냥 메서드
    public void nonStaticMethod() {
        System.out.println(" 추상클래스 안의 nonStaticMethod() 호출");
    }

    public static void StaticMethod() {
        System.out.println(" 추상클래스 안의 StaticMethod() 호출");
    }
}
