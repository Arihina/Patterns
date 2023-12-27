package Composite;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("leaf");
    }
}
