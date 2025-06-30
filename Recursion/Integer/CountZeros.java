package Recursion.Integer;

public class CountZeros {
    public static void main(String[] args) {
         int n = 30204;
        System.out.println(zeros(n,0));
    }
    static int zeros(int n, int count){
        while(n>0){
        if(n%10==0){
            return zeros(n/10,count+1);
        }
        else
        {
            return zeros(n/10,count);
        }}
        return count;
    }
}
