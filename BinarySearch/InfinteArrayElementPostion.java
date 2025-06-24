package BinarySearch;

public class InfinteArrayElementPostion {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,9,10,12,15,17,19, 22,23,24,25,26,27};
        int target = 10;
        int ans=findingRange(arr,target);
        System.out.println(ans);
    }
        public static int findingRange(int[] arr, int target)
        {
            int start=0;
            int end=1;
            while(target>arr[end]) {
                int newStart = end + 1;
                end = end+ ((end-start+1) *2);
                start = newStart;
            }

            return searchPosition(arr, target, start,end);
        }
        public static int searchPosition ( int[] arr, int target,int start, int end)
        {
            while (start <= end) {
                int mid = start+(end-start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
}
