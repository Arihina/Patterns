package CoR;

public class ConcreteHandler1 extends AbsHandler {
    @Override
    public void handle(int request) {
        System.out.println("Works concrete handler 1 with request " + request);
        if (successor != null) {
            successor.handle(request);
        }
    }
}
