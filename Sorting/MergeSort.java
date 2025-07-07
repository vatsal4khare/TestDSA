package Sorting;

import java.util.Arrays;

public class MergeSort {
    //This solution is with extra space, we have another file with in-place solution
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeLeftAndRightArray(left,right);
    }
    static int[] mergeLeftAndRightArray(int[] first, int[] second){
        int i =0 ;
        int j =0 ;
        int k =0 ;

        int[] mergedArray = new int[first.length+second.length];
        while(i<first.length && j <second.length){
            if(first[i]<second[j]){
                mergedArray[k]=first[i];
                i++;
                k++;
            }
            else {
                mergedArray[k]=second[j];
                j++;
                k++;
            }
        }
        while(i<first.length){
            mergedArray[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mergedArray[k]=second[j];
            j++;
            k++;
        }
        return mergedArray;
    }

}
