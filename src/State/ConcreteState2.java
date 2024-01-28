package State;

public class ConcreteState2 implements State {
    private final String state = "Concrete State 2";

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void action2(Context context) {
        System.out.println("Action 2 from " + state);
    }

    @Override
    public void action1(Context context) {
        System.out.println("The action is not available in this state");
    }
}
