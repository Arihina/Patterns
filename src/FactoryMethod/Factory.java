package FactoryMethod;

public class Factory {
    public Product getProduct(char choice){
        if (choice == '1'){
            return new ConcreteProduct1();
        }
        else if (choice == '2'){
            return new ConcreteProduct2();
        }
        else {
            return null;
        }
    }
}
