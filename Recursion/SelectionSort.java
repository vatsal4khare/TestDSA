package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={-1,2,3,88,5,8,-10};
        int largest=0;
        selectionSort(arr, 0,arr.length-1, largest);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int i ,int correctPosition, int largest){
        while(i<=correctPosition) {
            if (arr[largest] < arr[i]) {
                largest = i;
                i=i+1;
            }
            else
            {
                i=i+1;
            }
        }
        //swap largest index element with its correct position
        if(correctPosition<0) {return;}
        int temp = arr[largest];
        arr[largest]=arr[correctPosition];
        arr[correctPosition]=temp;
        selectionSort(arr,0,correctPosition-1, 0);
    }
}
