package lecture.day05;

public class Phone {
    //필드 선언
    public String model;
    public String color;

    // Phone p = new Phone(); //  객체 생성시 클래스명()을 자동호출
    // 생성자 메서드(constructor)
    // 컴파일러가 생성자가 한 개도 없을 때 자동으로 기본생성자(default constructor)를 만들어줌.
    // public Phone(){}

    //메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}