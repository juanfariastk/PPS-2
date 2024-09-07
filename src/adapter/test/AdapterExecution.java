package adapter.test;

import adapter.model.Adaptee;
import adapter.model.Adapter;

public class AdapterExecution {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
