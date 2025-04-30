package lecture.day08.thread_practice;

// 동시에 증가, 감소처리를 하고 싶은 경우.
// 각각을 ThreadClass로 만들기!
// 상속 이용 하면 동시처리 기능을 가진 class를 만들 수 있음
public class Thread1 extends Thread{
    // 부모인 Thread 클래스의 메서드 중
    // run() 메서드에 내가 동시에 처리하고 싶은 내용을 재정의

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("증가: " + i);
        }
    }
}
