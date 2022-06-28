package abstractFactory;

import java.util.Objects;

public class PlantFactory extends Factory{
    public Plant createPlant(String type){
        if (Objects.equals(type, "Tomato")){
            return new Tomato();
        } else if (Objects.equals(type, "Potato")) {
            return new Potato();
        }
        return null;
    }

    public Animal createAnimal(String type){
        return null;
    }
}
