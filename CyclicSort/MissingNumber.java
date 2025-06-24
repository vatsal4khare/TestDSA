package CyclicSort;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int mNum=missingNumber(arr);
        System.out.println(mNum);
    }
    public static int missingNumber(int[] arr)
    {int i = 0;
        while(i<arr.length)
        {

            if(!(arr[i]==arr[arr[i]-1]))
            {
                swap(arr,arr[i]-1,i);
            }
            else
            {
             i++;
            }
        }
        for(int j = 0 ; j < arr.length ; j ++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int firstNum, int lastNum)
    {
        int temp = arr[firstNum];
        arr[firstNum]=arr[lastNum];
        arr[lastNum]=temp;
    }
}
