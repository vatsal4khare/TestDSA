package Backtracking;

import java.util.Arrays;

public class AllPathsPrint {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        allPathsPrint("",0,0, maze, new int[maze.length][maze[0].length],1);
    }
    static void allPathsPrint(String ans, int row, int col, boolean[][] maze, int path[][], int step){
        if(row== maze.length-1 && col==maze[0].length-1){
            path[row][col]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if(maze[row][col]==false){
            return;
        }
        maze[row][col]=false;
        path[row][col]=step;

        if(row<maze.length-1){
            allPathsPrint(ans+"D",row+1,col,maze,path,step+1);
        }
        if(col<maze[0].length-1){
            allPathsPrint(ans+"R",row,col+1,maze,path,step+1);
        }
        if(row>0){
            allPathsPrint(ans+"U",row-1,col,maze,path,step+1);
        }
        if(col>0){
            allPathsPrint(ans+"L",row,col-1,maze,path,step+1);
        }
        maze[row][col]=true;
        path[row][col]=0;
    }
}
