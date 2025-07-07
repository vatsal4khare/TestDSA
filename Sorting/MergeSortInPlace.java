package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    //This solution is with extra space, we have another file with in-place solution 
    public static void main(String[] args) {
        int[] arr={5,3,4,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if(end-start==1)
        {
            return;
        }
        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,arr.length);
         mergeLeftAndRightArray(arr, start, mid, end);
    }
    static void mergeLeftAndRightArray(int[] newarr, int s, int m , int e){
        int i =s ;
        int j =m ;
        int k =0 ;
        int[] mergedArray = new int[e-s];
        while(i<m && j <e){
            if(newarr[i]<newarr[j]){
                mergedArray[k]=newarr[i];
                i++;
                k++;
            }
            else {
                mergedArray[k]=newarr[j];
                j++;
                k++;
            }
        }
        while(i<m){
            mergedArray[k]=newarr[i];
            i++;
            k++;
        }
        while(j<e){
            mergedArray[k]=newarr[j];
            j++;
            k++;
        }

        for(int l = 0 ;l <mergedArray.length;l++ ){
            newarr[s+l]=mergedArray[l];
        }
    }

}
