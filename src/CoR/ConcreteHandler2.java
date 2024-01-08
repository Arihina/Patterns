package CoR;

import java.sql.SQLOutput;

public class ConcreteHandler2 extends AbsHandler {
    @Override
    public void handle(int request) {
        System.out.println("Works concrete handler 2 with request " + request);
        if (successor != null) {
            successor.handle(request);
        }
    }
}
