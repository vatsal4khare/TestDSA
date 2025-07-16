package Backtracking;

import java.util.ArrayList;

public class PrintPaths {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<String>();
        paths("",2,2);
    }
    static void paths (String p,int row , int col){
        if(row==0 && col==0){
            System.out.println(p);
            return;
        }
        if(row>0){
        paths("D"+p,row-1,col);
        }
        if (col>0){
        paths("R"+p,row,col-1);
        }
    }
}
