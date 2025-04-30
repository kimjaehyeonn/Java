package practice.basic.ch14;

public class BeepPrintExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableClass());
        
        thread.start(); // 작업스레드 수행
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
            Thread.sleep(500);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
