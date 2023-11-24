package abstractDemo;

abstract public class Parent {
    int age;
    abstract void career(String name);
    abstract void partner(String name,int age);
    static void sayHello(){
        System.out.println("Hello");
    }
    void helloWorld(){
        System.out.println("Hello World");
    }
}
