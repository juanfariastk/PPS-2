package interator.model;

import java.util.List;

@SuppressWarnings("hiding")
public class ConcreteInterator<Object> implements Interator<Object> {
    private List<Object> collection;
    private int position = 0;

    public ConcreteInterator(List<Object> collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return position < collection.size();
    }

    public Object next() {
        return collection.get(position++);
    }
}
