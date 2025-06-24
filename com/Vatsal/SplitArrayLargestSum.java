package com.Vatsal;

//We have to divide an array(given) in m(given) parts such that we have the smallest largest sum

//Condition to satisfy at all times - The number of parts we divide the array in should be equal to m
//Condition to satisfy at all times - The sum of elements of the sub array should be the least large

//Maximum value we can have is = The sum of all the elements in an array (end)
//Minimum value we can have is = The largest element in an array  (start)

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int m =2;
        int ans = findAns(arr,m);
        System.out.println(ans);
    }
    public static int findAns (int[] arr,int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end = end + arr[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int parts = 1;
            int sum = 0;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    parts++;
                } else {
                    sum = sum + num;
                }
            }
            if (parts > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; //Here, always, start =end
    }
}
