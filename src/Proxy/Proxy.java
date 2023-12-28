package Proxy;

public class Proxy implements Subject {
    private RealSubject rs;

    private void init() {
        if (rs == null) {
            rs = new RealSubject();
        }
    }

    @Override
    public void func2() {
        init();
        rs.func2();
    }

    @Override
    public void func1() {
        init();
        rs.func1();
    }
}
