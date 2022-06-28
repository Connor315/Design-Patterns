package abstractFactory;

import java.util.Objects;

public class AnimalFactory extends Factory{
    public Animal createAnimal(String type){
        if (Objects.equals(type, "Dog")){
            return new Dog();
        } else if (Objects.equals(type, "Cat")) {
            return new Cat();
        }
        return null;
    }

    public Plant createPlant(String type) {
        return null;
    }
}
