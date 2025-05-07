package lecture.day11.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        /* 익명 클래스 방식
        action(new Calculable() {

            @Override
            public void calculate(int x, int y) {

            }
        }*/
        // 람다로 재정의 하고 있음.
        // 함수이름이 있는 걸로 별도로 안만들어서 그렇지 재정의하고 있음.
        action((x,y)-> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        action((x,y)-> {
            int result = x-y;
            System.out.println("result: " + result);
        });
    }
    // 인터페이스 implements 안하고 그냥 람다식으로
    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}
