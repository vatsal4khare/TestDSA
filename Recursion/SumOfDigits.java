package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(Sum(9022));
    }
    static int Sum(int n)
    {  if(n<=0)
        {
            return 0;
        }
        return Sum(n/10)+ (n%10);
    }
}
