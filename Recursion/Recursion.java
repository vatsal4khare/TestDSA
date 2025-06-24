package Recursion;

import java.io.PrintStream;

public class Recursion {
    public static void main(String[] args) {
        int a = 1;
        print(1);
    }

    public static void print(int a) {
        System.out.println(a);
        if(a==5)
        {
            return;
        }
        print(a + 1);
        //This function print is a tail recursive function because here
        //the last statement is S.O.println and the current call function's
        //job is done and current call function is not concerned with
        //what the next call function will do that is print(a+1).
    }
//public static void main(String[] args) {
//    int firstnum=0;
//    int secondnum=1;
//    int n =7;
//    for(int i = 0 ; i < n ; i ++)
//    {
//        System.out.println(firstnum);
//        int nextdigit = firstnum + secondnum ;
//        firstnum=secondnum;
//        secondnum = nextdigit;
//    }
//}
}
