package practice.basic.ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자_model
    public Car(String model) {
        this.model = model;
    }

    // speed_getter/setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // 메서드
    void run(){
      System.out.printf("%s가 달립니다.(시속:%dkm/h)", this.model, this.getSpeed());
    }
}
