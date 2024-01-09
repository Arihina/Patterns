package Iterator;

import java.util.ArrayList;

public class ConcreteAggregate<T> implements Aggregate {
    ArrayList<T> lst = new ArrayList<>();

    public void setElem(T elem) {
        lst.add(elem);
    }

    public T getElem(int index) {
        return lst.get(index);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    class ConcreteIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < lst.size();
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return lst.get(index++);
            }
            return null;
        }

        @Override
        public Object getFirst() {
            return lst.get(0);
        }

        @Override
        public boolean isDone() {
            return index >= lst.size();
        }
    }
}
