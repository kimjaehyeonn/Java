package practice.advanced.ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {


        Person person = new Person();

        // static method
        person.action((Computer::staticMethod));

        //instanceMethod
        Computer computer = new Computer();
        person.action((computer::instanceMethod));
    }
}