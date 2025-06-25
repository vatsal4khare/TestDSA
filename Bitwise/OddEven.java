package Bitwise;

public class OddEven {
    public static void main(String[] args) {
        int a =67;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(isOdd(a));
    }
    public static boolean isOdd(int a) {
        return (a & 1) ==1;
//        Here we are finding out the last digit of 67 being represented in bitwise format
//        We know that 1 & 1 is always 1 and 1 & 0 is always zero(Bitwise AND operator)
//        Now, if the last digit is 1, we AND it with 1 and if we find the answer as 1, then its odd, otherwise if last digit is 0
//        we AND it with 1 so we will get 0 only, so we will know it is even
//        because excluding the right most digit of any bitwise number will always sum up to be an even number
//        and now if the right most digit is 1 we know that even all number plus right most 1 is odd, other wise even
//        Here, 67 is 1000011 in Binary
//        now if we AND this number with 0000001, we will get 0000001 because any number when AND with 0 is always 0 like stated in line 10 above
//        and similarly, any number AND with 1 will give 1, so the answer we get for 67&1 will be the result of the last digit whether it is 0 or 1
    }
}
