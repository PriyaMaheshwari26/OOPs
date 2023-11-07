package introduction;

public class WrapperClasses {
    public static void main(String[] args) {
//        final  A obj=new A();
        A obj=new A();
        obj.name="Priya";
        //can not modify final
//        obj.num=0;
        //will give error
//        obj=new A();
        for (int i = 0; i < 1000000000; i++) {

            obj=new A();
        }
    }
}

class A{
    String name;
    final  int num=10;
    A(){
        System.out.println("Object Created");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}