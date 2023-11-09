package properties.polymorphism;

public class ObjectPrinting {
    int num;
    public ObjectPrinting(int num){
        this.num=num;
    }
    public String toString(){
        return "num is: "+num;
    }
    public static void main(String[] args) {
        ObjectPrinting obj=new ObjectPrinting(8);
        System.out.println(obj);
    }
}
