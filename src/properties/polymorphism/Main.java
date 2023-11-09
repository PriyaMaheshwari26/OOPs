package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        Square square=new Square();
        Circle circle=new Circle();
        shapes.area();
//        square.area();
        circle.area();

        //We can assign parent type ref. var to child class object,
        // it'll call method from the class that is being assigned to it(here BoxWeight);
        //it happens at run time, It's called as Dynamic Memory Dispatch

    }
}
