package BinarySearch;
//Find the smallest index of the target element in a Mountain Array
public class MountainArray {

    public static void main (String[] args){
        int[] arr={1,2,3,4,5,4,3,2}; // This is a mountain array with target element = 3 which appears twice. So the smallest index will be 1
        int targetElement = 3;
        //Steps
        //1. Find the peak element
        //2. Look at the left of the peak element, if element found then return
        //3. If element not found at the left of the peak element. look at right
        int peakIndex =PeakIndex(arr);
        int leastIndex=BinarySearch(arr,0,peakIndex, targetElement);
        if(leastIndex==-1){
            leastIndex=OrderAgnosticBinearSearch(arr,peakIndex+1,targetElement);
            System.out.println(leastIndex);
        }
        else {
            System.out.println(leastIndex);
        }
    }
    public static int OrderAgnosticBinearSearch(int[] arr, int start, int target){
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                start=mid+1;
            } else if (target>arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr, int start,int end,int target){
        while(start<end){
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
    public static int PeakIndex(int[] arr) {
        int start=0;
        int end = arr.length-1;

        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}

