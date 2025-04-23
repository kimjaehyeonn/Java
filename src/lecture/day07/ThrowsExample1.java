package lecture.day07;

public class ThrowsExample1 {
    public static void main(String[] args) {
        //findClass() 호출한 main도
        // 1. try-catch로 예외처리 할 수 있고
        // 2. main()을 부른 곳으로 예외처리를 떠넘길 수 있음.
        //    jvm에게 떠넘겨짐.
        try{
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("호출한 곳에서 예외처리함.:" + e.toString());
        }
    }
    public static void findClass()  throws ClassNotFoundException  {
        Class.forName("java.lang.String2");    }
}
