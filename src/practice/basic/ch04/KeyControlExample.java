package Java.src.practice.basic.ch04;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("""
                    -----------------------------
                    1. 증속 | 2. 감속 | 3. 중지
                    -----------------------------
                    """);
            System.out.print("선택");
            int x = sc.nextInt();

            if (x == 1) {
                System.out.println("현재속도 " + x);
            }
            if (x == 2) {
                System.out.println("현재속도 = 0");
            }
            if (x == 3) {
                System.out.println("프로그램 종료");
                break;
            }


        }
        sc.close();


    }
}
