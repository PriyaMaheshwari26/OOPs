package properties.inheritance;

public class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        super();
    }
    BoxWeight(int weight){
        this.weight=weight;
    }
    public BoxWeight(int l, int h, int w, int weight) {
        // used to initialise values present in parent class
        super(l, h, w);
        // what is this? call the parent class constructor
        //super keyword will always point(call) the nearest parent class
//        System.out.println(super.weight);
        System.out.println(super.l);
        this.weight = weight;

    }


}
