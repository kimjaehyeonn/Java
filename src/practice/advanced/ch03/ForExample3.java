package practice.advanced.ch03;

public class ForExample3 {
    public static void main(String[] args) {


        for (int i =0; i <5; i++) {
            int j = 5;
            while (i != j ){
                System.out.print("*");
                j--;
            }
            System.out.println("");
        }
    }
}
