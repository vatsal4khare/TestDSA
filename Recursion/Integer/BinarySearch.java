package Recursion.Integer;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,10,12,15};
        int s = 0 ;
        int e = arr.length-1;
        int target=9;
        int ans = search(arr,s,e, target);
        System.out.println(ans);
    }
    public static int search (int[] arr, int s, int e, int target)
    {
        if(s>e)
        {
            return -1;
        }
        int m = s+ (e-s) /2 ;
        if(arr[m]==target)
        {
            return m;
        }
        else if(arr[m]>target)
        {
           return search(arr,s, e-1 , target);
        }
        else
        {
            return search(arr,m+1, e , target);
        }
    }
}
