package staticExample;

public class StaticBlock {
    static int a=10;
    static int b;
//    will only run once when the first object is created i.e. when the class is loaded
    static {
        System.out.println("I'm in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(a+" "+b);
        b+=5;
        StaticBlock obj1=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
