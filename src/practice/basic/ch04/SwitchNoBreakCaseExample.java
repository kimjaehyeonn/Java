package practice.basic.ch04;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 10; //10,11
        System.out.println("[현재시간:" + time + "시]");

        switch (time) {
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("회의");
            case 10:
                System.out.println("업무");
            case 11:
                System.out.println("외근");

        }

    }
}
