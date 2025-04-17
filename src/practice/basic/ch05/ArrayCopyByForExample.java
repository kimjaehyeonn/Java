package Java.src.practice.basic.ch05;

public class ArrayCopyByForExample {
    public static void main(String[] args) throws Exception {

        int[] newIntArray = new int[5];
        int[] oldIntArray  = {1,2,3};

        for (int i=0;  i <= oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];

        }

    }
}
