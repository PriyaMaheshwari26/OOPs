package properties.inheritance;

public class BoxPrice extends BoxWeight {
    int cost=1;
    public BoxPrice(){
        super();
        this.cost=-1;
    }
    public BoxPrice(int weight,int cost){
        super(weight);
        this.cost=-1;
    }
    public BoxPrice(int side,int weight,int cost){
        super(side,side,side,weight);
        this.cost=-1;
    }
}
