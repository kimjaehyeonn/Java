package practice.basic.ch14;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        // 익명 클래스: 이름 없이 인터페이스나 추상클래스를 즉석에서 구현하는 클래스
        // 익명 객체: 익명 클래스로 만든 객체
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 스레드한테 시킬 일
                // Toolkit 도구모음 클래스
                // beep()
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
        });
        //별도의 작업스레드 생성
        thread.start();

        // 메인스레드에서 for문 동작
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
