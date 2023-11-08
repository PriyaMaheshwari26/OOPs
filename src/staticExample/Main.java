package staticExample;

import static staticExample.Human.population;

public class Main {
    public static void main(String[] args) {
        Human akash=new Human("Akash",21,25000);
        System.out.println(population);
        Human rahul=new Human("Rahul",35,40000);
        //will print 1 for each but it should be 2 for both or same for every human here comes static var
//        System.out.println(akash.population);
//        System.out.println(rahul.population);
        System.out.println(population);//it is Human.population without even creating object
        System.out.println(population);
//        greeting() //need instance to call a non-static method from a static method
        Main obj=new Main();
        obj.greeting();
    }

    void  hello(){
        System.out.println("Welcome");
    }
    void greeting(){
        hello();//a non-static method can easily call a non-static method without any instance
    }
}
