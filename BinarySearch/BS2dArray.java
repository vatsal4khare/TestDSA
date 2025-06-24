package BinarySearch;

import java.net.BindException;
import java.util.Arrays;

public class BS2dArray {
    public static void main(String[] args) {
        int arr[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
        };
        int target = 11;

        System.out.println(Arrays.toString(Search(arr,target)));
    }
    public static int[] Search(int arr[][], int target){
        int rows=arr.length;
        int cols=arr[0].length;
        if(cols==0)
        {
            return new int[]{-1,-1};
        }
        if(rows==1)
        {
            return BinarySearch(arr,target,0,0,cols-1);
        }
        int startRow=0;
        int endRow=arr.length-1;
        int middleColumn = cols/2;
        while(startRow<(endRow-1)){
            int middleRow=startRow +(endRow - startRow) /2 ;

            if(target==arr[middleRow][middleColumn]){
                return new int[]{middleRow,middleColumn};
            }
            else if(target>arr[middleRow][middleColumn])
            {
                startRow=middleRow;
            }
            else
            {
                endRow=middleRow;
            }
        }
        if(target == arr[startRow][middleColumn]){
            return new int[] {startRow,middleColumn};
        }
        if(target == arr[startRow+1][middleColumn]){
            return new int[] {startRow+1,middleColumn};
        }
        if(target < arr[startRow][middleColumn]){
            return BinarySearch(arr,target, startRow, 0, middleColumn-1);
        }
        if(target > arr[startRow][middleColumn]&& target <= arr[startRow][cols - 1]){
            return BinarySearch(arr,target, startRow, middleColumn+1, cols-1);
        }
        if(target < arr[startRow+1][middleColumn]){
            return BinarySearch(arr,target, startRow+1, 0, middleColumn-1);
        }
        else {
            return BinarySearch(arr,target, startRow+1, middleColumn+1, cols-1);
        }
    }
    public static int[] BinarySearch(int arr[][], int target, int row, int startIndex, int endIndex){

        while(startIndex<=endIndex){
            int mid = startIndex +(endIndex-startIndex)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if (arr[row][mid]<target)
            {
                startIndex=mid+1;
            }
            else
            {
                endIndex=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
