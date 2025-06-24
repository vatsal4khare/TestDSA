package CyclicSort;

import java.util.ArrayList;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/1655301733/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3};
//        int[] arr = {1,1};
//        int[] arr = {1,1,2};
        int missingNumber = findDuplicate(arr);
        System.out.println(missingNumber);
    }
    public static int findDuplicate(int[] arr){
        int i = 0;
        while(i<arr.length)
        { int expectedIndex = arr[i]-1;
            if(arr[i]==arr[expectedIndex])
            {
                i++;
            }
            else {
                swap(arr,expectedIndex,i);
            }
        }
        for(int j = 0 ; j < arr.length ; j ++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int firstNum, int lastNum)
    {
        int temp = arr[firstNum];
        arr[firstNum]=arr[lastNum];
        arr[lastNum]=temp;
    }

}
