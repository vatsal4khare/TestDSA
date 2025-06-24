package BinarySearch;

public class Cieling {

    public static void main(String[] args){
        int[] arr ={2,4,8,10,12,14,15,16,17,20,22};
        int target = 13;
        int ans =cieling(arr,target);
        System.out.println(arr[ans]);
    }
    public static int cieling(int[] arr, int target)
    {

        int start = 0 ;
        int end = arr.length-1;
        int mid;

        while(start<=end)
        {
            mid = Math.round((start+end)/2);

            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        //ans - When we are looking for cieling of a number, we revert the start when while loop breaks i.e start =end+1
        //Explanantion written in DSA notebook below green pen
        return start;
    }
}
