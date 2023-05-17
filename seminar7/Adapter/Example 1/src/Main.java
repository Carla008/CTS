public interface Target {
    void request();
}
public class Adapter implements Target{
    private  Adaptee adaptee;
    public  Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public  void request(){
        adaptee.specificRequest();
    }
}
public class Adaptee{
    public void specificRequest(){
        System.out.println("Adaptee specific request");
    }
}
public class Client{
    public static void main(String[] args){
        Adaptee adaptee=new Adaptee();
        Target target=new Adapter(adaptee);
        target.request();
    }
}
