package practice.advanced.ch08.sec12;

public class InstanceofExample {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            // Bus bus = (Bus) vehicle; 자동 형변환 해줌.
            bus.checkFare();
            bus.run();
        } else if (vehicle instanceof Taxi) {
            Taxi taxi = (Taxi) vehicle;
            taxi.run();
        }
    }

}