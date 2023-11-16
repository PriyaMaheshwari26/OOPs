package abstractDemo;

public class Son extends Parent{
    public Son(int age){
        this.age=age;
    }
    @Override
    void career(String name) {
        System.out.println("I want to be "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+"She is "+age+" years old");
    }
}
