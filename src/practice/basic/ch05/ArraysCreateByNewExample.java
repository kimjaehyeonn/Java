package Java.src.practice.basic.ch05;

public class ArraysCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        String[] arr2 = new String[3];
        for (int i = 0; i < arr1.length; i++) {  //000
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) { //nul null null
            System.out.println(arr2[i]);
        }
    }
}
