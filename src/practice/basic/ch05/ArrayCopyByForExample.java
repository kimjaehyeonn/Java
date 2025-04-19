package practice.basic.ch05;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] newIntArray = new int[5];
        int[] oldIntArray = {1,2,3};

        for (int i= 0;i <oldIntArray.length;i++){
            newIntArray[i] = oldIntArray[i];
        }
        for (int x =0; x<newIntArray.length;x++){
            System.out.print(newIntArray[x] + " " );
        }
    }
}
