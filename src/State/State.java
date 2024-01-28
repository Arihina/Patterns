package State;

public interface State {
    String getState();
    void action(Context context);
}
