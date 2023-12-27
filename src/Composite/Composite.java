package Composite;

import java.util.List;
import java.util.ArrayList;


public class Composite implements Component {
    private List<Component> leaves = new ArrayList<Component>();

    public void operation() {
        for (Component leaf : leaves) {
            leaf.operation();
        }
    }

    public void add(Leaf leaf) {
        leaves.add(leaf);
    }

    public void remove(Leaf leaf) {
        leaves.remove(leaf);
    }
}
