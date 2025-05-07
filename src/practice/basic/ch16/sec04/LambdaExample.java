package practice.basic.ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문 2개
        person.action((x,y)-> {
            double result = x + y;
            return result;
        });

        // sum 이용
        person.action((x,y)-> sum(x,y));


    }
    public static double sum(double x, double y) {
        return (x+y);
    }
}
