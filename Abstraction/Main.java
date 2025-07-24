package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.profession();
        son.SonMethod();

        Parent.ParentNormalMethod();

        Daughter daughter = new Daughter();
        daughter.profession();

        Son son1 = new Son("Vatsal");
        System.out.println(son1.name);
        Parent refParent = new Son();
        refParent.profession();




    }
}

