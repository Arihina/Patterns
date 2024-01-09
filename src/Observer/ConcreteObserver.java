package Observer;

public class ConcreteObserver implements Observer {
    private String state;

    public ConcreteObserver(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(String state) {
        this.state = state;
        showState();
    }

    public void showState() {
        System.out.println("State is " + state);
    }
}
