// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConcreteBuilder b = new ConcreteBuilder.Builder().
                setParam1(1).
                setParam2(1.2).
                setParam3(" ").
                build();
    }
}