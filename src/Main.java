import AbsFactory.ConcreteFactory1;
import AbsFactory.ConcreteFactory2;
import Adapter.Adapter;
import Bridge.ConcreteImplementation1;
import Bridge.ConcreteImplementation2;
import Bridge.RefinedAbstraction;
import FactoryMethod.Factory;
import FactoryMethod.Product;
import Proxy.Proxy;
import Proxy.Subject;
import Singleton.SingletonV3;
import Composite.*;
import Decorator.*;
import Facade.Facade;
import Flyweight.FlyweightFactory;
import CoR.*;

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

        // Adapter
        Adapter obj = new Adapter();
        obj.doSomething();

        // Bridge
        RefinedAbstraction refinedAbstraction1 = new RefinedAbstraction(new ConcreteImplementation1());
        refinedAbstraction1.someMethod();

        RefinedAbstraction refinedAbstraction2 = new RefinedAbstraction(new ConcreteImplementation2());
        refinedAbstraction2.someMethod();

        // Composite
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();

        Composite comp1 = new Composite();
        comp1.add(leaf1);

        Composite comp2 = new Composite();
        comp2.add(leaf2);

        Composite comp3 = new Composite();
        comp3.add(comp1);
        comp3.add(comp2);

        comp3.operation();

        // Decorator
        Decorator decorator = new ConcreteDecorator(new ConcreteComponent());
        decorator.standardMethod();
        decorator.newMethod();

        // Facade
        Facade facade = new Facade();
        facade.start();

        // Flyweight
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight(1).func();
        flyweightFactory.getFlyweight(2).func();

        // Proxy
        Subject proxy = new Proxy();
        proxy.func1();
        proxy.func2();

        // Chain of Responsibility
        AbsHandler handler1 = new ConcreteHandler1();
        AbsHandler handler2 = new ConcreteHandler2();
        AbsHandler handler3 = new ConcreteHandler1();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.handle(1);
        handler1.handle(3);
    }
}