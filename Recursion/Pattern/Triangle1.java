package Recursion.Pattern;

public class Triangle1 {
    public static void main(String[] args) {
//        Pattern 1 in following 2 ways
//        patternWay1(5);
//        patternWay2(5,0);
//        Pattern 2 in following 2 ways
//        pattern1Way1(5);
//        pattern1Way2(5,0);
//        Pattern 3 - combination of above 2 triangle types
//        patternWay1(5);
//        pattern1Way1(5);
//        Pattern 4 - combination of above 2 triangle types
        pattern1Way1(5);
        patternWay1(5);

    }
    static void patternWay1(int n){
        for(int i = n ; i >0 ; i--) {
            System.out.print("*");
        }
        System.out.println();
        if(n<=0){
            return;
        }
        patternWay1(n-1);

    }
    static void patternWay2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            patternWay2(r,c+1);
        }
        else{
            System.out.println();
            patternWay2(c-1,0);
        }

    }
    static void pattern1Way1(int n){
        if(n<=0){
            return;
        }
        pattern1Way1(n-1);
        for(int i = n ; i >0 ; i--) {
            System.out.print("*");
        }
        System.out.println();
    }
    static void pattern1Way2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            pattern1Way2(r,c+1);
            System.out.print("*");
        }
        else{
            pattern1Way2(r-1,0);
            System.out.println();
        }
    }
}
