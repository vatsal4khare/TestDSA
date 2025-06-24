package CyclicSort;

public class FindMissingNumber {
    //In an array of range 0->n with continuous numbers where n is the total length of array, find the missing number from the array
    public static void main(String[] args) {
//        int[] arr={3,0,1};
        int[] arr={0,1};
        int missingNum=MissingNumber(arr);
        System.out.println(missingNum);
    }
    public static int MissingNumber(int[] arr)
    {
        int i=0;
        while(i < arr.length)
        {
           int correct=arr[i];
           if(arr[i] < arr.length && arr[i]!=arr[correct])
           {
               swap(arr,i,correct);
           }
           else {
               i++;
           }
        }
        for(i=0; i <arr.length ; i ++)
        {
            if(arr[i]!=i)
            {
                return i;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int firstIndex, int lastIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
