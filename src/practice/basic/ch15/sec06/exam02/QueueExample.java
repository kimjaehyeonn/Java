package practice.basic.ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> q = new LinkedList<>();

        q.offer(new Message("sendMail", "홍길동"));
        q.offer(new Message("sendSMS", "신용권"));
        q.offer(new Message("sendKakaoTalk", "김자바"));

        while (!q.isEmpty()) {
            Message mesage = q.poll();
            switch ( mesage.command){
                case "sendMail":
                    System.out.println(mesage.to + "님에게 메일을 보냅니다");
                    break;
                    case "sendSMS":
                    System.out.println(mesage.to +"님에게 문자를 보냅니다.");
                    break;
                    case "sendKakaoTalk":
                    System.out.println(mesage.to +"님에게 카카오톡을 보냅니다.");
                    break;

            }

        }


    }
}
