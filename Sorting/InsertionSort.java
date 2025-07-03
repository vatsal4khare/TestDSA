package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {4,2,1,3,6};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void InsertionSort(int[] arr){

        for(int i = 0 ; i < arr.length-1; i ++)
        {
            for(int j = i+1 ; j >0 ; j --)
            {
                if(arr[j]>arr[j-1]){
                    break ;
                }
                else
                {
                    swapElement(arr,j,j-1 );
                }
            }
        }
    }
    public static void swapElement(int[] arr, int elementIndex1, int elementIndex2) {
        int temp = arr[elementIndex1];
        arr[elementIndex1] = arr[elementIndex2];
        arr[elementIndex2] = temp;
    }
}
