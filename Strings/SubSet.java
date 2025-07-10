package Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<ArrayList<Integer>> ans = subSet(arr);
//        System.out.println(ans);
    }
    static List<ArrayList<Integer>> subSet(int[] arr){
        List<ArrayList<Integer>> outer = new ArrayList<>();
        System.out.println(outer);
        outer.add(new ArrayList<>());
        System.out.println(outer);
        for(int n : arr){
            int x =outer.size();
            System.out.println(x);
            for(int i = 0 ; i < x ; i ++) {
                ArrayList<Integer> inner = new ArrayList<>(new ArrayList<>(outer.get(i)));
                System.out.println(inner);
                inner.add(n);
                System.out.println(inner);
                outer.add(inner);
                System.out.println(outer);
            }
        }
        return outer;
            }
}
