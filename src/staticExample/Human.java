package staticExample;

public class Human {
    String name;
    int age;
    int salary;
//    int population;
    static int population;
    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        population+=1;
    }




}
