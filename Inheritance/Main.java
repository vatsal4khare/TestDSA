package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box boxObj = new Box(9,10);
        System.out.println(boxObj.height);
        System.out.println(boxObj.length);
//        System.out.println(boxObj.width); --Not possible
        System.out.println();

        BoxWeight boxWeightObj = new BoxWeight();
        System.out.println(boxWeightObj.height);
        System.out.println(boxWeightObj.length);
        System.out.println(boxWeightObj.width);
        System.out.println(boxWeightObj.productOfLWH);
        System.out.println();

        BoxWeight boxWeightObj1 = new BoxWeight(11);
        System.out.println(boxWeightObj1.height);
        System.out.println(boxWeightObj1.length);
        System.out.println(boxWeightObj1.width);
        System.out.println(boxWeightObj1.productOfLWH);
        System.out.println();

        Box referenceOfBox = new BoxWeight();
        System.out.println(referenceOfBox.length);

        //Why this is possible
        //Here the object created is of type child class and the reference variable is of Parent class
        // and parent class constructor needs to be run
        //When The statement runs, the parameterized constructor of child class is initialized and the
        //reference to the parent class is also given. Since the flow if from down to up, this is possible
        Box referenceOfBox1 = new BoxWeight(55);
        System.out.println(referenceOfBox1.length);

        //Why this is not possible
        //Here the object created is of type parent class and the reference variable is of Child class
        //When The statement runs, the constructor of parent class needs to be run along with the
        //reference made to the child class. Since this flow is from up to down, this is not possible.
        //How will we run the constructor os the child class(reference of child obj) when the obj created
        //if of Parent class
//        BoxWeight referenceOfBoxWeight = new Box();

        BoxPrice bp = new BoxPrice(17, 200);
        System.out.println(bp.cost);
        System.out.println(bp.length);
        System.out.println(bp.height);
        System.out.println(bp.width);
        System.out.println(bp.productOfLWH);
    }
}
