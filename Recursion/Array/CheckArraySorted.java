package Recursion.Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,8,9,12};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int prev){
        while(prev+1<arr.length){
        if(arr[prev]<arr[prev+1])
        {
            return isSorted(arr, prev+1);
        }
        else return false;
        }
        if(prev==arr.length-1)
        return true;
        else return false;
    }
}
