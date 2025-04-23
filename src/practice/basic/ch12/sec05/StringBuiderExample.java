package practice.basic.ch12.sec05;

public class StringBuiderExample {
    public static void main(String[] args) {
        String data = new StringBuilder().append("def").insert(0, "ABC").delete(3, 4).toString();
        // def  -> ABCdef -> ABCf
        // 실제 결과: ABCef

        System.out.println(data);
    }
}
