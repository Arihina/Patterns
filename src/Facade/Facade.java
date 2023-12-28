package Facade;

public class Facade {
    private final A a;
    private final B b;
    private final C c;

    public Facade() {
        a = new A();
        b = new B();
        c = new C();
    }

    public void start() {
        a.someMethod();
        b.someMethod();
        c.someMethod();
    }
}
