package practice.basic.ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        // Overflow
        // 자료형 별 값의 최대 범위를 벗어나느 경우
        // 발생한 carry(넘치는 값)을 버림처리하고 sign bit를 반전

        byte var1 = 125;
        for(int i=0; i<5;i++) {
            var1++;
            System.out.println("var1 = " + var1); // 126, 127, -128,-127,-126
        }

        byte var2 = -125;
        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2 = " + var2);
        }
    }
}
