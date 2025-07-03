package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {-2,8,1,0};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr){

        for(int i = 0 ; i < arr.length; i ++)
        {
            int lastIndex = arr.length - i - 1;
            int maxIndex = MaxIndex(arr,i);
            swapElement(arr,lastIndex,maxIndex);
        }
    }
    public static void swapElement(int[] arr, int last, int max){
        int temp = arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
    public static int MaxIndex(int[] arr, int skipIndex){
        int maxElementIndex=0;
        for(int i = 0 ; i < arr.length - skipIndex ; i ++){
         if(arr[maxElementIndex]<arr[i])
         {
             maxElementIndex=i;
         }
        }
        return maxElementIndex;
    }
}
