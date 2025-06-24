package com.Vatsal;

public class EvenDigitElements {
//Find the number of elements in an array which have even number of digits.
    public static void main(String[] args){
        int[] arr={1,3,2,9,18};
        int ans=EvenDigits(arr);
        System.out.println(ans);

    }
    public static int EvenDigits(int[] arr)
    {
        int evencount=0;
        int count=1;
        for(int i = 0 ; i < arr.length ; i ++)
        {
            while(!(arr[i]==0)) {
                arr[i] = arr[i] / 10;
                if (!(arr[i] == 0)) {
                    count++;
                }
                if (arr[i] == 0 && count%2==0) {
                    evencount++;
                }
            }
        }
        return evencount;
    }
}
