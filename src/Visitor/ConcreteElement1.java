package Visitor;

public class ConcreteElement1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElement1(this);
    }

    public void func() {
        System.out.println("Concrete Element 1 does something");
    }
}
