package practice.test.generic.extend.run;

import practice.test.generic.extend.Bunny;
import practice.test.generic.extend.DrunkenBunny;
import practice.test.generic.extend.Rabbit;
import practice.test.generic.extend.RabbitFarm;

public class Application {
    public static void main(String[] args) {
        /*
         * [Animal] (Interface)
         * ├── [Mammal] (implements Animal)
         * │       └── [Rabbit] (extends Mammal)
         * │              └── [Bunny] (extends Rabbit)
         * │                     └── [DrunkenBunny] (extends Bunny)
         * └── [Reptile] (implements Animal)
         *         └── [Snake] (extends Reptile)
         * */
        // generic class 작성 시 extends 키워드를 이용해서
        // 특정 타입만 제한을 걸 수 있다.
        // -> 특정 타입만 사용하도록 제한, 특정 타입 및 특정 타입의 자식타입들도 대입가능.

        // Rabbit의 후손이거나 Rabbit 타입인 경우만 사용 가능
        //  RabbitFarm<Animal> farm1 = new RabbitFarm<>():
        //  RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
        //  RabbitFarm<Snake> farm1 = new RabbitFarm<>();
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();
        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }
}
