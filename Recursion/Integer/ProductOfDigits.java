package Recursion.Integer;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(Product(123));
    }
    static int Product(int n)
    {  if(n==0)
    {
        return 1;
    }
        return Product(n/10)*(n%10);
    }
}
