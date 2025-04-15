package practice.basic.ch01;

public class Example {
    public static void main(String[] args) {
        String ANSI_GRAY_BACKGROUND = "\u001B[47m";  // 밝은 회색 텍스트
        String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_GRAY_BACKGROUND + "개발자가 되기 위한 필수 개발 언어 Java" + ANSI_RESET);
    }
}
