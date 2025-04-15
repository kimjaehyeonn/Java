package practice.advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner: 사용자 정의 자료형
        Scanner sc = new Scanner(System.in); // new는 heap에 공간을 만드는 연산자

        while(true) {

            System.out.print("입력문자열: ");
            String str = sc.nextLine();
            if(str.equals("q")) {
                break;
            }
            System.out.println("출력문자열: " + str);
        }

        // 스캐너 닫기
        System.out.println(" 종료");
        sc.close();
    }
}
