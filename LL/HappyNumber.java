package LL;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        slow = findSquareOfDigits(slow);
        fast = findSquareOfDigits(findSquareOfDigits(fast));

        while(slow!=fast){
            slow = findSquareOfDigits(slow);
            fast = findSquareOfDigits(findSquareOfDigits(fast));
        }
        if(slow == 1){
            return true;
        }
        return false;
    }
    public static int findSquareOfDigits(int n){
        int ans = 0;
        while(n>0) {
            int last = n % 10;
            ans = ans + (last * last);
            n = n / 10;
        }
        return ans;
    }
}
