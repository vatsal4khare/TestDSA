package BinarySearch;

public class PeakIndexMountainArray {
    public static void main(String[] args)
    {
        int[] arr={0,2,4,5,1};
//        int ans =peakIndexLinearSearch(arr);
        int ans1 =peakIndexBinearySearch(arr);
//        System.out.println(ans);
        System.out.println(ans1);
    }

    public static int peakIndexLinearSearch(int[] arr)
     {
         int ans =-1;
         int start = 0;
         while(start<arr.length) {
             if (arr[start] > arr[start + 1]) {
                 return start;
             }
            start=start+1;
         }
         return ans;
     }
    public static int peakIndexBinearySearch(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
        int mid=start+(end-start) / 2;
        if(arr[mid]>arr[mid+1])
        {
            end=mid;
        }
        else {
            start=mid+1;
        }
        }
        return start; // we can return end index also because both are equal
    }
}
