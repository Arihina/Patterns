package Mediator;

public class Colleague2 implements Colleague {
    private final Mediator mediator;

    public Colleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String text) {
        mediator.send(text, this);
    }

    @Override
    public void receive(String text) {
        System.out.println("Colleague 2 gets " + text);
    }
}
