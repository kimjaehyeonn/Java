package practice.test.collection.list;

import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        /*
        Stack
        선형 메모리 공간에 데이터를 저장하며 LIFO 자료구조
        * */

        Stack<Integer> integerStack = new Stack<>();
        //integerStack.add();         //Vector에서 상속받은 메서드 push 사용 권장.

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println(integerStack);

        // search(): 요소를 찾을 때
        System.out.println("integerStack.search(5) : " + integerStack.search(5)); // 1. peek에서부터 역순으로 1부터 시작.

        // peek(): 가장 상단의 요소 반환
        // pop(): 가장 상단의 요소 반환 후 제거.
        System.out.println("peek(): " + integerStack.peek()  ); //peek(): 5

        System.out.println(integerStack);  //[1, 2, 3, 4, 5]

        System.out.println("pop(): " + integerStack.pop()  );     //pop(): 5

        System.out.println(integerStack);  //[1, 2, 3, 4]
        System.out.println("pop(): " + integerStack.pop()  );     //pop(): 5
        System.out.println("pop(): " + integerStack.pop()  );     //pop(): 5
        System.out.println("pop(): " + integerStack.pop()  );     //pop(): 5
        System.out.println("pop(): " + integerStack.pop()  );     //pop(): 5
       // System.out.println("pop(): " + integerStack.pop()  );     //EmptyStackException




    }
}
