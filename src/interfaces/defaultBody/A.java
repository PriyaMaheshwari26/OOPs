package interfaces.defaultBody;

public interface A {
    void hello();
    //static interface method should always have a body and
    //called via interface name
    static void fun(){
        System.out.println("FUN Called");
    }
}
