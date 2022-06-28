package factory;

public class Create {

    public static void main(String args[]){
        Factory factory = new Factory();
        Animal firstDog = factory.createAnimal("Dog");
        Animal firstCat = factory.createAnimal("Cat");

        firstDog.setWeight(10.5);
        firstCat.setWeight(5.5);

        firstDog.getWeight();
        firstCat.getWeight();
        System.out.print(firstDog);
        System.out.print(firstCat);
    }
}
