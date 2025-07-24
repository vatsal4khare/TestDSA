package Abstraction;

public class Son extends Parent{

    public Son(String  name) {
        super(name);
        System.out.println(name);
    }
    public Son(){

    }
    @Override
    public void profession(){
        System.out.println("Son wants to be a coder");
    }

    public void SonMethod(){
        System.out.println("Normal son method");
    }
}
