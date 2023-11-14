package access;

import properties.inheritance.Box;
import properties.inheritance.BoxWeight;

public class BuiltInMethods {
    int marks;
    float grade;
    public BuiltInMethods(){
        super();
    }
    public BuiltInMethods(int marks,float grade){
        this.marks=marks;
        this.grade=grade;
    }
//    unique representation of an object via a num
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return super.toString();
    }

    //check if two objects are equal or not(hashcode)
    @Override
    public boolean equals(Object obj) {
        return this.marks==((BuiltInMethods)obj).marks;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public static void main(String[] args) {
//        BuiltInMethods obj=new BuiltInMethods();
//        BuiltInMethods obj1=obj;
//        BuiltInMethods obj2=new BuiltInMethods();
//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());
//        System.out.println(obj.toString());
//        System.out.println(obj.equals(obj1));
//        System.out.println(obj.equals(obj2));
//        if(obj==obj1){
//            System.out.println("Objects are equal...");
//        }
//        if(obj.equals(obj1)){
//            System.out.println("Objects are equal");
//        }

        BuiltInMethods b1=new BuiltInMethods(10,78.6f);
        BuiltInMethods b2=new BuiltInMethods(10,78.6f);
        if(b1==b2){
            System.out.println("Objects are equal...");
        }
        if(b1.equals(b2)){
            System.out.println("Objects are equal");
        }



//        BoxWeight obj=new BoxWeight();
//        System.out.println(obj instanceof Box); o/p- true
        BuiltInMethods obj=new BuiltInMethods();
        System.out.println(obj instanceof BuiltInMethods);
        System.out.println(obj instanceof Object);
        //stored in heap
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getConstructors().length);
    }
}
