package practice.basic.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args)  {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        // printLength(null); // NullPointException 발생.
        try {
            printLength(null);
        } catch (NullPointerException e) {
            e.printStackTrace();   // 스택 추적 내용을 모두 출력
            System.out.println(e.getMessage());  // 예외 객체의 메시지로 출력
        }// NullPointException 발생.
        System.out.println("[프로그램 종료]");
    }
}
