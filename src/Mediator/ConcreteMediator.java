package Mediator;

public class ConcreteMediator implements Mediator {
    private Colleague1 colleague1;
    private Colleague2 colleague2;

    public void setColleague1(Colleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String text, Colleague colleagueSender) {
        if (colleagueSender.equals(colleague1)) {
            colleague2.receive(text);
        }
        else {
            colleague1.receive(text);
        }
    }
}
