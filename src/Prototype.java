public class Prototype implements Copy{
    private int param1;
    private String param2;

    public Prototype(int param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public Prototype copy() {
        return new Prototype(param1, param2);
    }
}
