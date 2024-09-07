package interator.model;

import java.util.List;

public class ConcreteCollection<Object> implements InterableCollection<Object> {
    private List<Object> items;

    public ConcreteCollection(List<Object> items) {
        this.items = items;
    }

    public Interator<Object> createIterator() {
        return new ConcreteInterator<>(items);
    }
}
