package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,2,3,8,1};
        bubblesort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr, int row, int column) {
        if(row==0){
            return;
        }
        if(column<row){
            if(arr[column]>arr[column+1])
            {
                int temp = arr[column];
                arr[column]=arr[column+1];
                arr[column+1]=temp;
            }
            bubblesort(arr,row, column+1);
        }
        else{
            bubblesort(arr,row-1, 0);
        }
    }

}


