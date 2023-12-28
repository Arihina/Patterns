package Bridge;

public class RefinedAbstraction extends AbstractionClass {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void someMethod() {
        System.out.println("Refined Abstraction does some method");
        implementor.implementMethod();
    }
}
