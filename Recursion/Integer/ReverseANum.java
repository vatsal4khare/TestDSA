package Recursion.Integer;

public class ReverseANum {
    public static void main(String[] args) {
        int n = 12345;
//        Rev(n);
        System.out.println(Rev2(n));
//        System.out.println(sum);
    }
//    Way 2
    static int Rev2(int n)
    {
        int noOfDigits = (int)(Math.log10(n))+1;
        return helper(n, noOfDigits);
    }
    public static int helper(int n, int digits)
    {
        if(n  %10==n)
        {
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10 , digits-1);
    }

//    Way 1
    static int sum = 0;
    static void Rev(int n)
    {
        if(n==0)
        {
            return;
        }
        sum = sum*10+n%10;
        Rev(n/10);
    }
}
