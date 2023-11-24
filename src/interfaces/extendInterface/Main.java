package interfaces.extendInterface;

public class Main  implements B{
    @Override
    public void fun() {
        System.out.println("Have fun!");
    }

    @Override
    public void greet() {
        System.out.println("Welcome...");
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.fun();
        main.greet();
    }
}
