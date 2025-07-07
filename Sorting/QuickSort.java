package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 1, 8};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
    }

    static void sort(int[] nums, int low, int hi) {
        if(low>=hi){
            return;
        }
        int start = low;
        int end = hi;
        int m = start + (end-start)/2;
        int pivot = nums[m];
        while(start<end){

            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }

        if(start<=end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }}

        sort(nums,low,end);
        sort(nums,start,hi);
    }
}