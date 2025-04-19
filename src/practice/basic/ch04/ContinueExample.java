package practice.basic.ch04;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }
}
