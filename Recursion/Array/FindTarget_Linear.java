package Recursion.Array;

public class FindTarget_Linear {
    public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 6, 7};
    int target=7;
        System.out.println(find(arr,target,0));
    }
    static int find(int[] arr,int target, int i) {
        while (i <= arr.length - 1) {
            if (arr[i] == target) {
                return i;
            } else {
                return find(arr, target, i + 1);
            }
        }
        return -1;
    }
}
