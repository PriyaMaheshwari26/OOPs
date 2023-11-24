package interfaces.defaultBody;

public class Main implements B{
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void greet() {
//        B.super.greet();
        System.out.println("Greeting");
    }
//no need to override until required
public static void main(String[] args) {
    Main obj=new Main();
    obj.hello();
    obj.greet();
    //static interface method should always have a body and
    //called via interface name
    A.fun();
}
}
