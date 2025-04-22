package practice.basic.ch08.sec10;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus(); // 자동형변환

        vehicle.run();
        // vehicle.checkFare();

        Bus bus = (Bus)vehicle;  // 강제 형변환
        bus.run();
        bus.checkFare();

    }
}
