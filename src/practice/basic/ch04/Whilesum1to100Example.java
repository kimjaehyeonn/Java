package Java.src.practice.basic.ch04;

public class Whilesum1to100Example {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {

            sum += i;
            i++;

        }
        System.out.println(sum);
    }
}
