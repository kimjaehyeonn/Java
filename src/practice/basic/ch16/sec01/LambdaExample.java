package practice.basic.ch16.sec01;

/*람다식
* - 메서드를 하나의 식으로 표현해 익명함수를 생성하는 식
* */

/*
* 인터페이스에 정의된 추상메서드 사용방법
* 1. 인터페이스를 구현한 클래스를 정의하는 방법
*       CalculableImpl calculableImpl = new CalculableImpl();
*       Calculable.calculate(10,4);
* 2. 익명클래스를 활용해서 메서드 정의 후 사용하는 방법
*       Calculable c1 = new Calculable() {
*            @Override
*            public void calculate* int x , int y)
*            System.out.println( x+y );
*               }
* 3. 람다식 활용 방법*/



public class LambdaExample {
    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });
        action((x, y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}
