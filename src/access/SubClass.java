package access;

public class SubClass extends A{
    public SubClass(int num,String name){
        this.num=num;
        this.name=name;
    }
    public static void main(String[] args) {
        SubClass obj=new SubClass(10,"OOPs");
        System.out.println(obj.num);;
    }
}
