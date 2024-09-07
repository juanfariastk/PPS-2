package proxy.test;

import proxy.model.Proxy;
import proxy.model.Service;

public class ProxyExecution {
    public static void main(String[] args) {
        Service realService = new Service();

        Proxy proxy = new Proxy(realService);
        
        proxy.operation1();
    }
}
