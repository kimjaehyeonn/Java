package practice.advanced.ch04;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum = 0;
        int total = 0;
        for (int i =0; i < array.length; i++) {
            for(int j =0; j< array[i].length; j++){
                sum += array[i][j];
                total++;
            }

        }
        System.out.println("총합은: " + sum);
        System.out.println("평균은: " + (double)sum/total);

    }
}
