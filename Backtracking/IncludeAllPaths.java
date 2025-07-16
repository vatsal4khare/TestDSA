package Backtracking;

public class IncludeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        maze("",0,0, maze);
    }
    static void maze (String p,int row , int col, boolean[][] maze){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        maze[row][col]=false;
        if (row<maze.length-1){
            maze(p+"D",row+1,col,maze);
        }
        if (col<maze[0].length-1){
            maze(p+"R",row,col+1,maze);
        }
        if(row>0){
        maze(p+"U",row-1,col,maze);
        }
        if (col>0){
        maze(p+"L",row,col-1,maze);
        }

        maze[row][col]=true;
    }
}
