package com.Vatsal;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
//        int[][] arr1= {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        }; The code below will also work for arr1 but we want to find another way with minimum number of steps
        int target =10;

        System.out.println(Arrays.toString(Search(arr,target)));
    }
    public static int[] Search(int[][] arr, int target){
        int row=0;
        int column= arr.length-1;

        while(row<arr.length && column>=0){
            if(arr[row][column]==target)
            {
                return new int[] {row,column};
            }
            if(arr[row][column] < target){
                row++;
            }
            else
            {
                column--;
            }
        }
        return new int[] {-1,-1};
    }
}


