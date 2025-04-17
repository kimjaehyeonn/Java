package Java.src.practice.basic.ch05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;

        String str = null;
        System.out.println("총문자수" + str.length()); //  heap에 주소를 할당하지 않음
    }
}
