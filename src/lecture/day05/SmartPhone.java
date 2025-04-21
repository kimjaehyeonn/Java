package lecture.day05;

public class SmartPhone extends Phone {
    // 필드 2개. color, model ---> 3개
    // 메서드 4개. bell, sendVoice, receiveVoice, hangup ---> 6개.

    public boolean wifi; // 클래스 바로 아래 선언된 필드는 자동초기화
    // false 자동초기화;

    // color, model 객체 생성 시 초기화를 하고 싶은 경우
    public SmartPhone(String color, String model ) {
        // Phone(); 기본 생성자 호출은 자동으로 super()를 넣어줌;
        // super(); 컴파일 단계에서 무조건 첫줄에 넣어줌.
        this.color = color;
        this.model = model;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }

}
