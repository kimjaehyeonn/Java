package practice.advanced.ch04;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int deposit = 10000;
        int withdrawal = 2000;
        int balance = 8000;

        Scanner sc = new Scanner(System.in);
        String str = """
                --------------------------------
                1.예금 | 2.출금 | 3.잔고 | 4. 종료
                --------------------------------
                """;
        while (true) {
            System.out.println(str);
            System.out.print("선택> ");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("예금액>" + deposit);

            } else if (num == 2) {
                System.out.println("출금액>" + withdrawal);
            } else if (num == 3) {
                System.out.println("잔고> " + balance);
                
            } else if (num == 4) {
                System.out.println("프로그램 종료");
                break;

            }
        }
        sc.close();
    }

}


