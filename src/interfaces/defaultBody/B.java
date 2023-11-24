package interfaces.defaultBody;

public interface B extends A{
    default void greet(){
        System.out.println("Welcome");
    }
}
