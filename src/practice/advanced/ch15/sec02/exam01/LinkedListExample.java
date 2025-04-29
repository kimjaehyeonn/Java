package practice.advanced.ch15.sec02.exam01;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {


        List<Board> linkedlist = new LinkedList<>();
        Board b1 = new Board("a", "b", "c");
        Board b2 = new Board("d", "e", "f");
        Board b3 = new Board("g", "h", "i");
        Board b4 = new Board("j", "k", "l");
        Board b5 = new Board("m", "n", "o");

        linkedlist.add(b1);
        linkedlist.add(b2);
        linkedlist.add(b3);
        linkedlist.add(b4);
        linkedlist.add(b5);

        // .size() 저장된 요소 개수
        System.out.println(linkedlist.size());
        System.out.println("-----------------------------------------------");
        // @toString .3번째 데이터 추출하여 출력
        System.out.println(linkedlist.get(2));
        System.out.println("-----------------------------------------------");

        //  일반 for문
        for (int i = 0; i<linkedlist.toArray().length; i++)  {
            System.out.println(linkedlist.get(i));
        }
        System.out.println("-----------------------------------------------");

        // index 2 요소 제거
        linkedlist.remove(2);

        // 향상된 for 문
        for (Board b:  linkedlist) {
            System.out.println(b);
        }

    }
}