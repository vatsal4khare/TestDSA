package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {

    public static void main(String[] args) {
//    int[] arr = {1,2,2,4};
    int[] nums = {1,1};
    int [] missingNumber = findErrorNums(nums);
    System.out.println(Arrays.toString(missingNumber));
}
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length)
        {
            if(nums[i]==nums[nums[i]-1])
            {
                i++;
            }
            else {
                swap(nums,nums[i]-1,i);
            }
        }

        for(int j = 0 ; j < nums.length ; j ++) {
            if (nums[j] != j + 1) {
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    public static void swap(int[] arr, int firstNum, int lastNum)
    {
        int temp = arr[firstNum];
        arr[firstNum]=arr[lastNum];
        arr[lastNum]=temp;
    }
}
