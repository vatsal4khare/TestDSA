package CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,1,7};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CyclicSort(int[] arr){
        //we can also write the following code using while loop which will make this look much simpler

        //------------------Using for loop

//        for(int i = 0 ; i < arr.length ; i ++)
//        {
//            if (!(arr[i] == arr[arr[i] - 1])) {
//                swap(arr, i, arr[i] - 1);
//            }
//            if(!(arr[i] == arr[arr[i] - 1])){
//                i=i-1;
//            }
//            else {}
//        }

        //------------------Using While loop

//        int i = 0 ;
//        while(i<arr.length)
//        {
//            if (!(arr[i] == arr[arr[i] - 1])) {
//                swap(arr, i, arr[i] - 1);
//            }
//            else
//            {
//                i++;
//            }
//        }
    }
    public static void swap(int[] arr, int firstIndex, int lastIndex){
        int temp = arr[firstIndex];
        arr[firstIndex]=arr[lastIndex];
        arr[lastIndex]= temp;
    }
}
