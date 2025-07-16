package Backtracking;

public class Paths {
    public static void main(String[] args) {

        int ans = paths(3,3);
        System.out.println(ans);
    }
    static int paths (int row , int col ){
        if(row==1||col==1){
            return 1;
        }

        int x=paths(row-1,col);
        int y =paths(row,col-1);
        return x+y;
    }

}
