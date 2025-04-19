package practice.basic.ch05;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby가 참조하는 String 객체는 빈 문자열");
        }
    }
}
