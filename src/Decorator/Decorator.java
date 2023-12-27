package Decorator;

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component ref) {
        component = ref;
    }

    @Override
    public void standardMethod() {
        component.standardMethod();
    }

    public void newMethod() {

    }
}
