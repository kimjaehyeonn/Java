package practice.advanced.ch08.exam01;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();


    public void run() {
        tire1.roll();
        tire2.roll();
    }
}

