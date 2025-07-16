package Backtracking;

public class PrintPathsWithDiagonal {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<String>();
        paths("",2,2);
    }
    static void paths (String p,int row , int col){
        if(row==0 && col==0){
            System.out.println(p);
            return;
        }
        if(row>0 && col>0){
            paths(p+"D",row-1,col-1);
        }
        if(row>0){
            paths(p+"V",row-1,col);
        }
        if (col>0){
            paths(p+"H",row,col-1);
        }
    }
}
