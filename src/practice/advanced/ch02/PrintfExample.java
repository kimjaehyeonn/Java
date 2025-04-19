package practice.advanced.ch02;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: \t%d원\n", value);
        System.out.printf("상품의 가격: %d\t원\n", value);
        System.out.printf("상품의 가격: %06d원\n", value);

        double area =3.14159*10*10;
        System.out.printf("반지름이 %d인 원의 넓이는 %.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%d | %s\t|\t %s",1,name, job);
    }
}
