package com.Vatsal;

import java.util.Arrays;

public class SearchElement2Darray {

    public static void main(String[] args){
        int[][] arr= {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 23;
        int[] ans=search2D(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search2D(int[][] arr, int target)
    {
        for(int i= 0 ; i < arr.length;i++)
        {
            for(int j = 0 ; j < arr[i].length;j++) {
                if (target == arr[i][j]) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
