package lecture.day03;

public class TV {
    // 속성 - 색, 가격, 크기, 볼륨, 채널 , 온오프
    // 항목(field) - 채널, 볼륨, 온오프
    // 멤버변수, 인스턴스 변수
    int ch;
    int vol;
    boolean onOff;

    // 기능(동작) - 채널바꾸다, 유튜브보다
    // 멤버메서드(함수)
    public void 채널을바꾸다() {
        System.out.println("채널 바꾸다");
    }

    public void 유튜브보다() {
        System.out.println("유튜브보다");
    }
}
