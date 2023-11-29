package AbsFactory;

public class ConcreteProductA1 implements AbstractProductA{
    @Override
    public void showInfo() {
        System.out.println("Product A from factory 1");
    }
}
