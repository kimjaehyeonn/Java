package practice.test.generic.extend;

public class WildCardFarm {

    // 토끼가 어떤 토끼든 상관 x
    // (Rabbit, Bunny, DrunkenBunny)
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }
    // 토끼중 Bunny와  Bunny 하위만 가능
    //(Bunny, DrunkenBunny)
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }
    // 토끼중 Bunny와  Bunny 상위만 가능
    //(Bunny, Rabbit)
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
