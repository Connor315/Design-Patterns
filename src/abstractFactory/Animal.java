package abstractFactory;

abstract class Animal {
    protected double weight;

    public void getWeight(){
        System.out.println(weight);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}