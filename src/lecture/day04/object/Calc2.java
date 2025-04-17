package Java.src.lecture.day04.object;

public class Calc2 { //계산기
    //인스턴스 변수
    int price;
    // 클래스 가지고 만든 객체(인스턴스)
    // new를 이용해서 인스턴스 만든 다음에 접근 가능한 변수

    // 정적변수
    final static double PI  = 3.14;
    // final 변수명; --> 상수
    // final 메서드명(), fianl class 클래스명;
    //-> 상속과 관련된 개념!
    // final == 변경불가
    static String compnay = "KB";

    // 정적 메서드
    static void sum(int x, int y) {
        System.out.println(x+y);
        // static메서드 안에서는 필드 중에서
        // static 변수만 가능
        System.out.println(x + y + PI);
        // System.out.println(price);
    }
}