package practice.basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {

        // 업캐스팅
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // parent.field2 = "data2"; //parent 객체에는 Child의 타입이 없음.
        // parent.method3();

        //다운캐스팅
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
