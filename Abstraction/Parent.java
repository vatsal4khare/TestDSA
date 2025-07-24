package Abstraction;

public abstract class Parent {
    String name ;

    public Parent(){
    }
    public Parent(String name){
        this.name= name;

    }
    public abstract void profession();
    public static void ParentNormalMethod(){
        System.out.println("Normal Parent method");
    }
}
