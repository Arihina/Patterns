package Decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component ref) {
        super(ref);
    }

    @Override
    public void standardMethod() {
        super.standardMethod();
    }

    @Override
    public void newMethod() {
        System.out.println("Do update task");
    }
}
