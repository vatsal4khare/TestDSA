package Inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){

    }
    BoxPrice(int x, int cost){
        super(x);
        this.cost=cost;
    }
}
