package practice.basic.ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setGas(6);
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");
            myCar.run(6);
        }

        System.out.println("gas를 주입하세요.");
    }

    }


