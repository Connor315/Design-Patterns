package abstractFactory;

public class Create {

    public static void main(String args[]){
        Factory animalFactory = FactoryCreator.getFactory("Animal");
        Animal firstDog = animalFactory.createAnimal("Dog");
        Animal firstCat = animalFactory.createAnimal("Cat");

        firstDog.setWeight(10.5);
        firstCat.setWeight(5.5);

        firstDog.getWeight();
        firstCat.getWeight();
        System.out.print(firstDog);
        System.out.print(firstCat);

        Factory plantFactory = FactoryCreator.getFactory("Plant");
        Plant firstTomato = plantFactory.createPlant("Tomato");
        Plant firstPotato = plantFactory.createPlant("Potato");

        firstTomato.setHeight(1.2);
        firstPotato.setHeight(1.8);

        firstTomato.getHeight();
        firstPotato.getHeight();
        System.out.print(firstTomato);
        System.out.print(firstPotato);
    }
}
