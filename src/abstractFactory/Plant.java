package abstractFactory;

abstract class Plant {
    protected double height;

    public void getHeight(){
        System.out.println(height);
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
