package practice.advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" x 값 입력:  ");
        int x = sc.nextInt();
        System.out.print(" y 값 입력:  ");
        int y = sc.nextInt();
        System.out.print(" x + y  =  " + (int)(x+y));
        sc.close();

        ;}
}
