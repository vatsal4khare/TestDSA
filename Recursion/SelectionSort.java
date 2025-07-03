package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={-1,2,3,88,5,8,-10};
        int largest=0;
        selectionSort(arr, 0,arr.length-1, largest);
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int i ,int correctPosition, int largest){
        if (correctPosition < 0) {
            return;
        }
        if(i<=correctPosition) {
            if (arr[largest] < arr[i]) {
                largest = i;
                selectionSort(arr,i+1,correctPosition,largest);
            }
            else
            {
                selectionSort(arr,i+1,correctPosition,largest);
            }
        }
        else {
            int temp = arr[largest];
            arr[largest] = arr[correctPosition];
            arr[correctPosition] = temp;
            selectionSort(arr, 0, correctPosition - 1, 0);
        }
    }
    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }

}
