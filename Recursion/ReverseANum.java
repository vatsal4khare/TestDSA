package Recursion;

public class ReverseANum {
    public static void main(String[] args) {
        int n = 12345;
    }
    static void Rev(int n)
    {
        int result = 0;
        if(n==0){
            return;
        }
        result = result * 10 + n%10;
        Rev(n/10);

    }
}
