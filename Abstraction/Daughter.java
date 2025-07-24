package Abstraction;

public class Daughter extends Parent{
    public Daughter(String name) {
//        super(name);
    }
    public Daughter(){

    }

    @Override
    public void profession(){
        System.out.println("Daughter wants to be a Doctor");
    }
}
