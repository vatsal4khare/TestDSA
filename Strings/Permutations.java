package Strings;

import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("","abc");
//        System.out.println();
//        System.out.println(permutations("","abc",new ArrayList<String>()));
//        System.out.println("Below method creates a new list every time");
//        System.out.println(permutations1("","abc"));
//        System.out.println("Below method counts the numbers of permutation there can exist - we can either at the end display the size of array list " +
//                "or keep updating a variable everytime the unprocessed string gets empty");
//        System.out.println(permutations2("","abc",0));
//        System.out.println(permutations1("","abc").size());
                System.out.println("Below method counts the numbers of permutation where count is taken in method body and not arguments unlike permutations2 method");
        System.out.println(permutations3("","abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i ++){
            String sub1 = p.substring(0,i);
            String sub2 = p.substring(i,p.length());
            permutations(sub1+ch+sub2,up.substring(1));
        }

    }
    static ArrayList<String> permutations(String p, String up, ArrayList list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i ++){
            String sub1 = p.substring(0,i);
            String sub2 = p.substring(i,p.length());
            permutations(sub1+ch+sub2,up.substring(1),list);
        }
        return list;
    }
    static ArrayList permutations1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(p);
            return newList;
        }
        ArrayList finalAns = new ArrayList<String>();
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i ++){
            String sub1 = p.substring(0,i);
            String sub2 = p.substring(i,p.length());
            ArrayList ans = permutations1(sub1+ch+sub2,up.substring(1));
            finalAns.addAll(ans);
        }
        return finalAns;
    }
    static int permutations2(String p, String up, int count){
        if(up.isEmpty()){
            count++;
            return count;
        }
        int finalCount = 0;
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i ++){
            String sub1 = p.substring(0,i);
            String sub2 = p.substring(i,p.length());
            finalCount =finalCount+ permutations2(sub1+ch+sub2,up.substring(1),count);

        }
        return finalCount;
    }
    static int permutations3(String p, String up){
        if(up.isEmpty()){;
            return 1;
        }
        int finalCount = 0;
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length(); i ++){
            String sub1 = p.substring(0,i);
            String sub2 = p.substring(i,p.length());
            finalCount =finalCount+ permutations3(sub1+ch+sub2,up.substring(1));

        }
        return finalCount;
    }
}
