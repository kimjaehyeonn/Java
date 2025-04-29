package practice.basic.ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        // K: Tv, M:  String
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");
        // Getter의 리턴값이 TV  타입
        Tv tv = product1.getKind();
        String tvmodel = product1.getModel(); //  String 으로 받아주기.

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel(" SUV 자동차");
        Car car = product2.getKind();
        String carrmodel = product2.getModel();


    }
}
