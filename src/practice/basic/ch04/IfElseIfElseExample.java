package Java.src.practice.basic.ch04;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) {
            System.out.println("""
                    점수가 90이상입니다.
                    등급은 A입니다.
                    """);
        } else if ((score < 90) && (score >= 80)) {
            System.out.println("""
                    점수가 90미만 80이상입니다.
                    등급은 B입니다.
                    """);
        } else if ((score < 80) && (score >= 70)) {
            System.out.println("""
                    점수가 80미만 70이상입니다.
                    등급은 C입니다.
                    """);
        } else {
            System.out.println("""
                    점수가 70미만입니다.
                    등급은 D입니다. 
                    """);
        }

    }}

