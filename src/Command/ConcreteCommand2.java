package Command;

public class ConcreteCommand2 implements Command {
    private final Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.func2();
    }
}
