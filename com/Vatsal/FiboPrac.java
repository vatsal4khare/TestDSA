package com.Vatsal;

public class FiboPrac {
    public static void main(String[] args) {
        int n = 8 ;
        fibo(n);
        System.out.println(fiboRec(n));
    }
    static void fibo(int n ){
        int first = 0;
        int second = 1;
        int total=0;
        for(int i = 0 ; i < n ; i ++){
            System.out.print(first+" ");
            total=first+second;
            first=second;
            second=total;
        }
    }
    static int fiboRec(int n){
        if(n<2){
            return n ;
        }
        return fiboRec(n-1)+fiboRec(n-2);
    }
}
