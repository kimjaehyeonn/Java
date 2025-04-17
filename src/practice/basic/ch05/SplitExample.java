package Java.src.practice.basic.ch05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] java = board.split(",");
        System.out.println("번호: " + java[0]);
        System.out.println("제목: " + java[1]);
        System.out.println("내용: " + java[2]);
        System.out.println("성명: " + java[3]);
        for (int i = 0; i < 4; i++) {
            System.out.println(java[i]);
        }
    }
}