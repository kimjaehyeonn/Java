package practice.basic.ch01.sec11;

public class VariableInitializationExample {
    public static void main(String[] args) {
        //int value; 
        // 초기화 해주지 않으면 쓰레기 값이 들어가므로 오류 발생
        int value = 10;
        int result = value + 10;
        System.out.println(result);
    }
}
