package BinarySearch;
//We have to find in a sorted array, how many times it has been rotated clockwise to be where it is right now
//Ex - {15,18,2,3,6,12} - This array must be rotated twice and original array must be {2,3,6,12,15,18}
public class RotationCount {

    public static void main(String[] args) {
        int[] arr={2,3,6,12,15,18};
        int peakIndex= Pivot(arr);
        System.out.println(peakIndex+1);
    }
    public static int Pivot(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            } if (mid>start && arr[mid]<arr[mid-1]) {
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
