package CyclicSort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        System.out.println("Element = "+ arr[0]);
//        System.out.println("Element's expected index = " + (arr[0]-1));
//        System.out.println("Element currently at the expected index = " + arr[arr[0]-1]);
        //Element is expected to be at element - 1 index
        List<Integer> ans=findDuplicates(arr);
        System.out.println(ans);

    }
        public static List<Integer> findDuplicates(int[] arr) {
        int i = 0 ;
         while( i < arr.length) {
             int expectedIndex = arr[i] - 1;
             if (arr[i] != arr[expectedIndex]) {
                 swap(arr, expectedIndex, i);
             } else {
                 i++;
             }
         }
             ArrayList<Integer> duplicates = new ArrayList<>();
             for(int j = 0 ; j < arr.length ; j ++)
             {
                 if(arr[j]!=j+1)
                 {
                     duplicates.add(arr[j]);
                 }
             }
        return duplicates;
    }
    public static void swap (int[] arr , int firstIndex, int lastIndex)
    {
        int temp = arr[firstIndex];
        arr[firstIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }
}
