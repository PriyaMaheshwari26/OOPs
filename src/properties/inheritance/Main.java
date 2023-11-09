package properties.inheritance;

//every class in java inherits Object class
public class Main {
    public static void main(String[] args) {
        Box box1=new Box();
        System.out.println(box1.l+" "+box1.w+" "+ box1.h);

        BoxWeight boxWeight=new BoxWeight(2);
        System.out.println(boxWeight.l+" "+ boxWeight.w+" "+ boxWeight.h+" "+boxWeight.weight);

        BoxWeight boxWeight1=new BoxWeight(2,4,6,8);
        System.out.println(boxWeight1.l+" "+ boxWeight1.w+" "+ boxWeight1.h+" "+boxWeight1.weight);



        Box box2=new BoxWeight(5);


        //we can not assign child type ref var to parent class object
//        BoxWeight boxWeight2=new Box(1);

        BoxPrice boxPrice=new BoxPrice();
        System.out.println(boxPrice.cost);
        System.out.println(boxPrice.l);
    }
}
