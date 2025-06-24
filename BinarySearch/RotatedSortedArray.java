package BinarySearch;
//Find the index of an element in a rotated sorted array with all distinct values
//A rotated sorted array is an array which when rotated with k pivot index of that array, the starting elements fall after the last elements
//for eg - [1,2,3,4,5,6] when sorted with index 3 will become [4,5,6,1,2,3]

//In a question we might be at point where we asked to find the target element index, at that point the
//array can be either rotated or not, if rotated then we are not even sure by how many times(indexes)
public class RotatedSortedArray {

    public static void main (String[] args){
        int[] arr={4,5,6,7,0,1,2};
        int targetElement = 0;
        //Steps
        //1. Find the peak element (that will be pivot)
        //2. Look at the left of the peak element, apply normal binary search
        //3. Look at the right of the peak element, apply normal binary search
        int pivotIndex = Pivot(arr);
        if(pivotIndex==-1)
        {
            System.out.println( BinarySearch(arr,0,arr.length-1,targetElement));
        }
        else if(pivotIndex==targetElement)
        {
            System.out.println(pivotIndex);
        }
        else {
            int leastIndex = BinarySearch(arr, 0, pivotIndex, targetElement);
            if (leastIndex == -1) {
                leastIndex = BinarySearch(arr, pivotIndex + 1, arr.length - 1, targetElement);
                System.out.println(leastIndex);
            } else {
                System.out.println(leastIndex);
            }
        }
    }
    public static int BinarySearch(int[] arr, int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int Pivot(int[] arr) {
        int start=0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
}

