package adapter;

class Adaptee {
    public void specificRequest() {
        System.out.println("Specific");
    }
}

interface Target {
    public void request();
}

class ConcreteTarget implements Target {
    public void request() {
        System.out.println("This is Target...");
    }
}

class Adapter extends Adaptee implements Target{
    public void request() {
        super.specificRequest();
    }

    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
