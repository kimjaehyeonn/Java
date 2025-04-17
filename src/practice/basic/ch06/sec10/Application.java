package Java.src.practice.basic.ch06.sec10;

public class Application {
    public static int plus(int x ,int y ){
        return x+y;
    }

    public static void main(String[] args) {
       int a =  plus(1,3);
       // 오류 발생.
        // static이 아니면 객체를 생성 해줘야 됨
    }
}
