package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main (String[] args)
    {
        System.out.println(Arrays.toString(solution()));
    }
    public static int[] solution()
    {
        int[] arr={2,3,4,7,7,7,7,9,10};
        int target = 7;
        int[] ans={-1,-1};
        int start = searchPosition(arr, target,true);
        int end = searchPosition(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int searchPosition(int[] arr, int target, boolean findStartIndex)
    {
        int ans=-1;
        int start = 0;
        int end =arr.length-1;
        while(start<=end) {
            int  mid = Math.round((start+end)/2);
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if(findStartIndex)
                {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

