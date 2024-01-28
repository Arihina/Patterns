package State;

public class ConcreteState1 implements State {
    private final String state = "Concrete State 1";

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void action1(Context context) {
        System.out.println("Action 1 from " + state);
    }

    @Override
    public void action2(Context context) {
        System.out.println("The action is not available in this state");
    }
}
