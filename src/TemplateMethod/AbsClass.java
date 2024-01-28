package TemplateMethod;

public abstract class AbsClass {
    public void action() {
        System.out.println("Start action");
        templateAction();
        System.out.println("End action");
    }

    public abstract void templateAction();
}
