package Recursion.Integer;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
    public static int Fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return Fact(n-1) * n;
    }
}
