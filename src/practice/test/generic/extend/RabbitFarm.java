package practice.test.generic.extend;

//public class RabbitFarm<T extends Animalt> 도 가능. extends는 타입 제한을 위한 것. implements x.

// T 타입변수는 Rabbit 타입 혹은 Rabibit 하위 타입들만 가능
public class RabbitFarm<T extends Rabbit>{

    private T animal;

    public RabbitFarm(){

    }


    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
