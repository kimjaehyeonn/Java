package practice.test.excep.section1;

public class Application {
    public static void main(String[] args) throws Exception{

        ExceptionTest et = new ExceptionTest();
        /* 예외 처리 방법
        * -> try-catch 처리
        * */
        et.checkEnough(10000,5000);
    }

}
