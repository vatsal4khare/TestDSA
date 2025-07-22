package Inheritance;

public class BoxWeight extends Box{
//    int width = 5;
    int productOfLWH = this.width*super.height*super.length;

    BoxWeight(){

    }

    BoxWeight(int l){
        super(l);
    }
}
