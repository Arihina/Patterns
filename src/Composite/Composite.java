package Composite;

import java.util.List;
import java.util.ArrayList;


public class Composite implements Component {
    private List<Component> leaves = new ArrayList<Component>();

    @Override
    public void operation() {
        for (Component leaf : leaves) {
            leaf.operation();
        }
    }

    public void add(Component leaf) {
        leaves.add(leaf);
    }

    public void remove(Component leaf) {
        leaves.remove(leaf);
    }
}
