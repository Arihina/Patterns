package Proxy;

public class RealSubject implements Subject {

    @Override
    public void func2() {
        System.out.println("func2");
    }

    @Override
    public void func1() {
        System.out.println("func1");
    }
}
