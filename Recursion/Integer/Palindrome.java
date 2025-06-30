package Recursion.Integer;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1222;
//        System.out.println(isPalindrome(n));
        String n1 = "naman";
        System.out.println(isPalindrome1(n1,0,n1.length()-1));
    }
//    String palindrome
    static boolean isPalindrome1(String n, int start, int end){
        while(start < end){
            if(n.charAt(start)!=n.charAt(end))
            {
                return false;
            }
            return isPalindrome1(n,start+1, end-1);
        }
        return true;
    }


//    Int palindrome
    static boolean isPalindrome(int n){
        int numberOfDigits = (int)(Math.log10(n))+1;
        int rev = helper(n,numberOfDigits);
        if(rev==n)
        {
            return true;
        }
        else return false;
    }
    static int helper(int n , int numOfDigits){
        if(n%10==n){
            return n;
        }
        int rem = n % 10;
        return (int)(rem % 10 * Math.pow(10, numOfDigits-1) + helper(n/10,numOfDigits-1));
    }
}
