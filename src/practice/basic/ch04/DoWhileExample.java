package Java.src.practice.basic.ch04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                메시지를 입력하세요
                프로그램을 종료하려면 q를 입력하세요
                """);
        String str;

        do {
            System.out.print(">");
            str= sc.nextLine();

                System.out.println(str);
            }while(!str.equals("q"));

//        while (true){
//        System.out.print(">");
//        String str = sc.nextLine();
//        if (str.equals("q")){
//            break;}
//        System.out.println(str);

            sc.close();
    }}
