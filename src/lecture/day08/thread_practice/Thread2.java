package lecture.day08.thread_practice;

public class Thread2 extends Thread{
    // 부모인 Thread클래스의 메서드 중
    // run() 메서드에 내가 동시에 처리하고 싶은 내용을 재정의

    @Override
    public void run() {
        for (int i = 100; i > 0 ; i--) {
            System.out.println("감소: " + i);
        }
    }
}
