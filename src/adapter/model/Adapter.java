package adapter.model;

public class Adapter implements Target {
    private Adaptee adapteeObject;
    
    public Adapter(Adaptee adapteeObject) {
        this.adapteeObject = adapteeObject;
    }

    public void setAdapteeObject(Adaptee adapteeObject) {
        this.adapteeObject = adapteeObject;
    }

    @Override
    public void request() {
        adapteeObject.specificRequest();
    }

}
