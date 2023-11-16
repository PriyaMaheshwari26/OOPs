package abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        this.age=age;
    }
    @Override
    void career(String name) {
        System.out.println("I want to be "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+"He is "+age+" years old");
    }
}
