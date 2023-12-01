package FactoryMethod;

import java.sql.SQLOutput;

public class ConcreteProduct2 extends Product{
    @Override
    public void showInfo() {
        System.out.println("Concrete Product 2");
    }
}
