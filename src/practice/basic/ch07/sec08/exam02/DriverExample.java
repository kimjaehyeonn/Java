package practice.basic.ch07.sec08.exam02;

import practice.basic.ch07.sec07.exam01.D;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
