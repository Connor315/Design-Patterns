package abstractFactory;

public class FactoryCreator {
    public static Factory getFactory(String choice){
        if(choice.equalsIgnoreCase("Animal")){
            return new AnimalFactory();
        } else if(choice.equalsIgnoreCase("Plant")){
            return new PlantFactory();
        }
        return null;
    }
}
