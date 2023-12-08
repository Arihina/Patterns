import AbsFactory.ConcreteFactory1;
import AbsFactory.ConcreteFactory2;
import Adapter.Adapter;
import Bridge.ConcreteImplementation1;
import Bridge.ConcreteImplementation2;
import Bridge.RefinedAbstraction;
import FactoryMethod.Factory;
import FactoryMethod.Product;
import Singleton.SingletonV3;

public class Main {
    public static void main(String[] args) {

        // Builder

        ConcreteBuilder b = new ConcreteBuilder.Builder().
                setParam1(1).
                setParam2(1.2).
                setParam3(" ").
                build();

        // Abstract Factory

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

        // Factory Method

        Product pr1 = new Factory().getProduct('1');
        Product pr2 = new Factory().getProduct('2');

        pr1.showInfo();
        pr2.showInfo();

        // Prototype
        Prototype prototype = new Prototype(123, "qwerty");
        Prototype newPrototype = prototype.copy();

        // Singleton
        SingletonV3.getSingleton();

        // Adapter.Adapter
        Adapter obj = new Adapter();
        obj.doSomething();

        // Bridge
        RefinedAbstraction refinedAbstraction1 = new RefinedAbstraction(new ConcreteImplementation1());
        refinedAbstraction1.someMethod();

        RefinedAbstraction refinedAbstraction2 = new RefinedAbstraction(new ConcreteImplementation2());
        refinedAbstraction2.someMethod();
    }
}