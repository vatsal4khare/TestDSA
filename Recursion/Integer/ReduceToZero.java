package Recursion.Integer;

public class ReduceToZero {
    public static void main(String[] args) {
    int n = 41;
        System.out.println(numberOfSteps(n,0));
        System.out.println(numberOfSteps1(n,0));
}
    static int numberOfSteps(int n, int count){
        while(n>0){
            if(n%2==0){
                return numberOfSteps(n/2,count+1);
            }
            else
            {
                return numberOfSteps(n-1,count+1);
            }}
        return count;
    }
    static int numberOfSteps1(int n, int count){
        while(n>0){
            if(n%2==0){
                return numberOfSteps(n/2,count+1);
            }
            else
            {
                return numberOfSteps(n-1,count+1);
            }}
        return count;
    }
}
