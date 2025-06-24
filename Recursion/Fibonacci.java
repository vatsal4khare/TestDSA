package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }
    static int fibo (int n)
    {
        if (n<2){
            return n;
        }
         return fibo(n-1)+fibo(n-2);
        //This function fibo is not a tail recursive function because here
        //the last statement waits for both the parts to be executed
        //completely, get their own answers, and the add them to return
        //the actual answer we need.


        // The recurrence relation of this code is linear recurrence relation because we are deducting 1 or 2 from the argument in each function call
        // This recurrence relation is also not optimal because this will take a lot of time for a bigger number, say 50
        // Also, this will compute the result of a recurrence tree even when it has been encountered before in the whole solution and this will result
        // in redundancy and more time taken
        // here comes dynamic programming into play
        // That's why Recursion + dynamic programming is a hot topic in interviews


        //There are two types of recurrence relation
        // 1. Linear Recurrence Relation - Example, above program
        // 2. Divide and Conquer Recurrence Relation (Divide by a factor) - Example, Binary Search

    }
}
