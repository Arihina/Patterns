package Facade;

public class Facade {
    private final A a = new A();
    private final B b = new B();
    private final C c = new C();

    public void start() {
        a.someMethod();
        b.someMethod();
        c.someMethod();
    }
}
