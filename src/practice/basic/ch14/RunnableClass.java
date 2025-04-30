package practice.basic.ch14;

import java.awt.*;

public class RunnableClass implements Runnable  {
@Override
    public void run(){
    // 스레드한테 시킬 일
    // Toolkit 도구모음 클래스
    // beep()
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for (int i = 0; i < 5; i++) {
        toolkit.beep();
        try
        {
            Thread.sleep(500);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
}
