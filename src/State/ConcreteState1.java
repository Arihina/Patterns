package State;

public class ConcreteState1 implements State {
    private final String state = "Concrete State 1";

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void action(Context context) {
        System.out.println("Action from " + state);
    }
}
