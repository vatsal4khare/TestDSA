package Recursion.Array;

import java.util.ArrayList;

public class FindAllTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6};
        int target = 4;
//        Way 1 - when we init Array list once and pass it in arguments
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(find(arr,target,0,list));

//        Way 2 - when we init Array list inside recursive method and dont pass it in arguments and
//        add its values while returning
        System.out.println(find(arr,target,0));
    }
//    static ArrayList find(int[] arr, int target,int i , ArrayList<Integer> list){
//        if(arr.length==i){
//            return list;
//        }
//        if (arr[i]==target){
//            list.add(i);
//        }
//         return find(arr,target,i+1,list);
//    }
    static ArrayList find(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
            if(arr.length==i){
            return list;
        }
        if (arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> prevAns= find(arr,target,i+1);
        list.addAll(prevAns);
        return list;
    }
}
