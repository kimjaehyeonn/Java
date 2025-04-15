package lecture.day02.test;

// int x = 100; // 모든 변수는 class 안으로 들어가야함. 전역변수x
public class VariableTest {
    public static void main(String[] args) {
        // 이 부품은 독립적으로 실행할 수 있는 부품이 됨.
        // 함수인데, 만약에 함수가 여러개인 경우 무조건 main()부터 호출.
        // 타입 변수명; --> 변수가 생성됨. 선언!
        // 자바는 변수에 들어갈 타입이 선언할 때 결정(정적 타이핑)
        // 기본형 4가지: 정수, 실수, 문자1, 논리
        // 정수: byte(1), short(2), int(4), long(8)
        byte age = 127;  // 변수는 소문자로 실행!
        short year = 2025;
        int hit = 210000000;
        long money = 2200000000L;

        // 실수: float(.7,4바이트), double(.15, 8바이트)
        float w = 70.5f;
        double h = 170.000000000000005;

        // 문자1: char
        char gender = '남'; //'홑따옴표

        // 논리형: boolean
        boolean food = false;


        System.out.println("내 나이는" + age + "살이야");
        // + 연산자가 하나라도 문자열이면 결과는 String.(결합연산자)
        System.out.println("내 몸무게는 " + w + " kg이야");
        System.out.println("내 성별은 " + gender + "이야");
        System.out.println("나는 오늘 아침을 먹었을까? " + food);
        String name = "김재현"; // "이중 따옴표
        String study = """
                나는
                자바를
                배운다.
                """;
        System.out.print("출력하고 엔터치지마!");
        System.out.println("내 이름은 " + name);
        System.out.println("공부 " + study); // 한 줄 복사 (ctrl+D)
        System.out.printf("내 이름은 %s이야", name);
        System.out.printf("내 몸무게는 %.2f이야, 내키는 %10.3f", w, h);

    }
}
