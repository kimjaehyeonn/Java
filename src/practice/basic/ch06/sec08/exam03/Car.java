package practice.basic.ch06.sec08.exam03;


public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (!(this.gas == 0)) {
            System.out.println(" gas 있습니다.");
            return true;
        } else {
            System.out.println("gas 없습니다.");
            return false;
        }
    }

    void run(int values) {
        int i = 0;
        while (i < values) {
            this.gas--;
            System.out.printf("달립니다.(gas잔량:%d)", this.gas);

            if (this.gas <= 0) {
                System.out.printf("멈춥니다.(gas잔량:%d)\n", this.gas);
                break;
            }
            i++;
        }
    }
}
