package interator.test;

import java.util.List;

import interator.model.ConcreteCollection;
import interator.model.InterableCollection;
import interator.model.Interator;

public class InteratorExecution {
    public static void main(String[] args) {
        List<String> items = List.of("Item1", "Item2", "Item3");
        InterableCollection<String> aggregate = new ConcreteCollection<>(items);
        Interator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
