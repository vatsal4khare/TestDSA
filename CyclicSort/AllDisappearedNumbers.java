package CyclicSort;

import java.util.ArrayList;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class AllDisappearedNumbers {
    public static void main(String[] args) {
        //In an array of integer 1 - n, return array of all the numbers that are missing from the array
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> missingNumber = findDisappearedNumbers(arr);
        System.out.println(missingNumber);
    }
    public static ArrayList<Integer> findDisappearedNumbers(int[] arr){
        int i = 0;
        while(i<arr.length)
        {
            if(arr[i]==arr[arr[i]-1])
            {
                i++;
            }
            else {
                swap(arr,arr[i]-1,i);
            }
        }
        ArrayList<Integer> missingNumbers=new ArrayList<Integer>();
        for(int j = 0 ; j < arr.length ; j ++) {
            if (arr[j] != j + 1) {
                missingNumbers.add(j+1);
            }
        }
        return missingNumbers;
    }
    public static void swap(int[] arr, int firstNum, int lastNum)
    {
        int temp = arr[firstNum];
        arr[firstNum]=arr[lastNum];
        arr[lastNum]=temp;
    }
}
