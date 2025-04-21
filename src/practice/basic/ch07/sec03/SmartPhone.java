package practice.basic.ch07.sec03;

public class SmartPhone extends Phone {
    public SmartPhone() {
        // super();
        // 부모의 기본 생성자를 호출할 수 없음
    }


    public SmartPhone(String model, String color) {
        // 자식생성자에서는 부모 생성자를 무조건 호출
        // 부모필드를 호출하려면, 부모 새엇ㅇ자가 그 필드를 매개변수로 받아야하고
        // 자식 생성자에서 super(필드에 대한 값)을 호출해야함.

        super(model, color);
        System.out.println("SmartPhone 생성자 호출됨");
    }

    /*
     * 메소드 재정의(overriding)
     * - 부모가 가지는 메소드 선언부를 그대로 사용하면서
     * - 자식 클래스에서 정의한 메소드대로 동작하도록 다시 작성]
     *
     * 오버라이딩의 성립요건
     * - 메소드 이름, 리턴타입, 매개변수의 타입, 갯수 순서가 동일해야한다.
     * - private/final 메서드 불가능
     * - 접근 제어자는 부모와 같거나 더 넓은 범위.
     * - 예외처리: 같은 예외나 더 구체적(하위) 예외 처리.
     * */
    @Override // 컴파일 시 정확히 오버라이딩 되었는지 체크해줌.
    public void printModel() {
        super.printModel();
    }


}
