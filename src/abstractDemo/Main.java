package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Daughter daughter=new Daughter(22);
        daughter.career("Developer");
        daughter.partner("Bob ",24);
        Son son=new Son(24);
        son.career("Engineer");
        son.partner("Jinny ",22);
        son.helloWorld();
        //call non-static method
        Parent.sayHello();

    }
}
