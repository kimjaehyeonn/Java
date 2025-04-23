package practice.basic.ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int sum = 0;

        for (int i=0; i<1000000; i++) {
         sum += i;
        }

        // 끝 시간 측정
        long endTime = System.nanoTime();

        // 실행 시간 계산
        long executionTime = endTime - startTime;

        //실행 시간 출력
        System.out.println(executionTime);
    }
}
