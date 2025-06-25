package Bitwise;

public class CountSetBits {
    public static void main(String[] args) {
        //SetBits are represented as 1 in Bit format
        //So when counting number of set bits, we are counting number of 1s
    int a = 6;
    System.out.println(Integer.toBinaryString(a));
    int count = 0;
    while(a>0)
    {
        if((a&1)==1) {
            count++;
        }
        a = a >> 1;
    }
    System.out.println(count);
}
}

