package CoR;

public abstract class AbsHandler {
    protected AbsHandler successor;

    public abstract void handle(int request);

    public void setSuccessor(AbsHandler successor) {
        this.successor = successor;
    }
}
