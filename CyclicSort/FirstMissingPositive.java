package CyclicSort;
//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] arr={3,4,-1,1};

        int missingPositive = firstMissingPositive(arr);
        System.out.println(missingPositive);
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0 ;
        while(i < arr.length)
        {
            int expectedIndex=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[expectedIndex])
            {
                swap(arr, i, expectedIndex);
            }
            else
            {
                i++;
            }
        }
        for(int j = 0 ; j < arr.length ; j ++)
        {
            if(arr[j]!=j+1)
            {
                return j+1;
            }
        }
         return arr.length+1;
    }
    public static void swap(int[] arr, int firstIndex, int lastIndex)
    {
        int temp = arr[firstIndex];
        arr[firstIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }
}
