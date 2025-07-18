package Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(subSeq(a,""));
        subSeq1(a,"");
    }
    static ArrayList<String> subSeq(String a, String res){
        if(a.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(res);
            return ans;
        }
        char ch = a.charAt(0);
        ArrayList<String> left = subSeq(a.substring(1),res+ch);
        ArrayList<String> right = subSeq(a.substring(1),res);
        left.addAll(right);
        return left;
    }
    static void subSeq1(String a, String res){
        if(a.isEmpty()){
            System.out.println(res);
            return ;
        }
        char ch = a.charAt(0);
        subSeq1(a.substring(1),res+ch);
        subSeq1(a.substring(1),res);
    }
}
