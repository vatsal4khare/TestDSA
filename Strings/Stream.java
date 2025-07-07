package Strings;

import java.sql.SQLOutput;

public class Stream {
    public static void main(String[] args) {
        String a = "baccad";
//        String ans =stream(a);
        String ans = stream(a,"");
        System.out.println(ans);
    }
//     static String stream (String a){
//        if(a.isEmpty()){
//            return "";
//        }
//        if(a.charAt(0)=='a'){
//            return stream(a.substring(1));
//        }
//        else
//        {
//            String ch = String.valueOf(a.charAt(0));
//            return ch+stream(a.substring(1));
//        }
//     }
    static String stream(String a , String res){
        if(a.isEmpty()){
            System.out.println(a);
            return "";
        }
                if(a.charAt(0)=='a'){
            return stream(a.substring(1), ""+a);
        }
        else
        {
            String ch = String.valueOf(a.charAt(0));
            return stream(a.substring(1),ch+a);
        }


    }
}
