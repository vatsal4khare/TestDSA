package Bitwise;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/
public class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(arr));
    }
    public int[][] flipAndInvertImage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] ^ 1;
            }
        }
        return arr;
    }
    public static void swap (int[] arr){
        int first=0;
        int end=arr.length-1;
        while(first<end) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }
    }
}
