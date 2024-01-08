package Command;

public class ConcreteCommand1 implements Command {
    private final Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.func1();
    }
}
