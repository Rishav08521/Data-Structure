package BACKTRACKING;

import java.util.*;

public class ratmazeindead22 {
    public static void main(String[] args) {
        int row=3;
        int cols=4;
        int [][] maze={{1,1,1,1},{1,0,1,1},{0,1,1,1}};
        print(0,0,row-1,cols-1,"",maze);

    }
    private static void print(int sr, int sc, int er, int ec, String s,int[][] maze){
        if(sr>er||sc>ec) return;
        if(sr>0||sc>0) return;
        if(sr==0&&sc==0){
            System.out.println(s);
            return;
        }
        maze[sr][sc]=0;
        maze[sr][sc]=-1;
        print(sr,sc+1,er,ec,"",maze);
        print(sr,sc+1,er,ec,"",maze);
        maze[sr][sc]=1;

    }
}
