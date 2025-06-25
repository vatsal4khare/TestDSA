package Bitwise;

public class NumberOfBaseBDigits {
    public static void main(String[] args) {
        int a = 6;
        int count = 0;
        while(a!=0)
        {
            count++;
            a=a>>1;
        }
        System.out.println(count);
    }
}
