package Backtracking;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,false,true},
                {true,false,true},
                {true,true,true}
        };
        maze("",maze.length-1,maze[0].length-1, maze);
    }
    static void maze (String p,int row , int col, boolean[][] maze){
        if(row==0 && col==0){
            System.out.println(p);
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        if(row>0){
        maze("D"+p,row-1,col,maze);
        }
        if (col>0){
        maze("R"+p,row,col-1,maze);
        }
    }
}
