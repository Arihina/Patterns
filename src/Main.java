import AbsFactory.AbstractProductA;
import AbsFactory.ConcreteFactory1;
import AbsFactory.ConcreteFactory2;
import AbsFactory.ConcreteProductA1;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder b = new ConcreteBuilder.Builder().
                setParam1(1).
                setParam2(1.2).
                setParam3(" ").
                build();

        ConcreteFactory1 factory1 = new ConcreteFactory1();
        var product1 = factory1.createProductA();
        var product2 = factory1.createProductB();

        product1.showInfo();
        product2.showInfo();

        ConcreteFactory2 factory2 = new ConcreteFactory2();
        var product3 = factory2.createProductA();
        var product4 = factory2.createProductB();

        product3.showInfo();
        product4.showInfo();
    }
}