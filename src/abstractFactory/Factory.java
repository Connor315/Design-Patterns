package abstractFactory;

abstract class Factory{
    public abstract Animal createAnimal(String type);
    public abstract Plant createPlant(String type);
}
