package practice.advanced.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> arraylist = new ArrayList<>();
        Board b1 = new Board("a","b","c");
        Board b2 = new Board("d","e","f");
        Board b3 = new Board("g","h","i");
        Board b4 = new Board("j","k","l");
        Board b5 = new Board("m","n","o");

        arraylist.add(b1);
        arraylist.add(b2);
        arraylist.add(b3);
        arraylist.add(b4);
        arraylist.add(b5);

        // .size() 저장된 요소 개수
        System.out.println(arraylist.size());
        System.out.println("-----------------------------------------------");
        // @toString .3번째 데이터 추출하여 출력
        System.out.println(arraylist.get(2));
        System.out.println("-----------------------------------------------");

        //  일반 for문
        for (int i = 0; i<arraylist.toArray().length; i++)  {
            System.out.println(arraylist.get(i));
        }
        System.out.println("-----------------------------------------------");

        // index 2 요소 제거
        arraylist.remove(2);

        // 향상된 for 문
        for (Board b:  arraylist) {
            System.out.println(b);
        }

    }
}
