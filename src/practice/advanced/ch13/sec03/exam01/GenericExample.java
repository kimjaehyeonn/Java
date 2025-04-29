package practice.advanced.ch13.sec03.exam01;

public class GenericExample {
    // boxing generic method
    // public static 이 메서드 안에서 T 라는 타입변수를 사용하겠다는 의미.
    // Box<T>(반환타입) boxing(메서드명)
    //(T t) 매개변수
    public static <T> Box<T> boxing (T t) {
        Box<T> box = new Box<>();
        box.set(t);  // box class의 필드 box 초기화

        return box;
    }


    public static void main(String[] args) {

        // Box<Integer>
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        // Box<String>
        Box<String> box2 = boxing("kim");
        String strValue = box2.get();
        System.out.println(strValue);

    }
}
