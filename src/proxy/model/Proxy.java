package proxy.model;

public class Proxy implements ServiceInterface {
    private Service realServiceObject;

    public Proxy(Service servc){
        this.realServiceObject = servc;
    }

    public boolean checkAcess(String user, String pswd){
        if(user.equals("admin") && pswd.equals("admin")){
            return true;
        }
        return false;
    }

    @Override
    public void operation1(){
        if(checkAcess("admin", "admin")){
            realServiceObject.operation1();
        }else{
            System.out.println("Access denied");
        }
    }
}
