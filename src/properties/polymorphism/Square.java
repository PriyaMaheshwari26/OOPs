package properties.polymorphism;

public class Square extends Shapes{
    //method-overloading-compile time
    public void area(){
        System.out.println("Area of square");
    }
    //with diff no. of args and return type
    public double area(int a){
        System.out.println("Area of square");
        return a;
    }
    //with diff types. of args with same return type
    public void area(double side){
        System.out.println("Area of square");
    }

    public void area(double side,String s){
        System.out.println(s+side);

    }

    public void area(String s,double side){
        System.out.println(s+side);

    }
}
