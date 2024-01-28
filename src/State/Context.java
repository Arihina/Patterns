package State;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void action1() {
        state.action1(this);
    }

    public void action2() {
        state.action2(this);
    }
}
