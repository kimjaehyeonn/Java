package practice.basic.ch11.sec05;

public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            findclass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외처리: " + e.toString());
        }
    }
        public static void findclass() throws ClassNotFoundException{
            Class.forName("java.lang.String2");
        }
    }

