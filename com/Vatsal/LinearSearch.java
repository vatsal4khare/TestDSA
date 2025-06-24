package com.Vatsal;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args){
        int[] arr={1,3,23,9,18};
        int target=18;
        boolean ans=linearSearch(arr,target);
        System.out.println(ans);
    }
    public static boolean linearSearch(int[] arr, int target)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
