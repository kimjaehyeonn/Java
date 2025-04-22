package practice.basic.ch08;

public interface InterProduct {
    /*
    * 인터페이스는 상수 필드만 작성 가능
    * public static final  -> 상수 필드 조합
    * */
    // 컴파일러가 자동으로 생성해줌.
    int MIN_NUM = 0;   // final이기 때문에 초기화 해주어야 함.
    int MAX_NUM = 0;   // final이기 때문에 초기화 해주어야 함.

    // 생성자를 가질 수 없음
    // public InterProduct(){};

    // 인터페이스는 구현부가 있는 메서드를 가질 수 없다.
    // public void nonStaticMethod(){}

    // static 메서드는 가질 수 있음
    public static void StaticMethod(){
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨 ");
    }

    // 추상메소드만 작성 가능
    public abstract void  nonStaticMethod ( );
    // 반환형과 메서드 명만 써줘도 됨.
    // 인터페이스를 상속받은 클래스는 public으로 고정.
    void abstMethod();

    // 인터페이스에서 일반 메소드를 만들기 위해서는 default 키워드를 붙여야한다.
    public default void defaultMethod(){
        System.out.println("interproduct 클래스의 default method호출됨.");
    }
}
