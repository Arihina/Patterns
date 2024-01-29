package Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visitConcreteElement2(ConcreteElement2 concreteElement2) {
        System.out.println("Visitor works in Concrete Element 2");
        concreteElement2.func();
    }

    @Override
    public void visitConcreteElement1(ConcreteElement1 concreteElement1) {
        System.out.println("Visitor works in Concrete Element 1");
        concreteElement1.func();
    }
}
