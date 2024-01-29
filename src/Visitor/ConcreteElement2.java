package Visitor;

public class ConcreteElement2 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElement2(this);
    }

    public void func() {
        System.out.println("Concrete Element 2 does something");
    }
}
