package BACKTRACKING;

public class ratmazeindeadleet {
    public static void main(String[] args) {
        int row=3;
        int cols=4;
        int[][] maze={{1,0,1,1 },
                      {1,1,1,1 },
                      {1,1,0,1 }};
       // boolean[][] isvisited=new boolean[row][cols];
        print(0,0,row-1,cols-1,"",maze);

    }
    private static void print(int sr,int sc,int er,int ec,String s,int[][] maze){
        if(sr<0||sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        if( maze[sr][sc]==0) return;
        if(maze[sr][sc]==-1) return;
        maze[sr][sc]=-1;
        print(sr,sc+1,er,ec,"",maze);
        print(sr+1,sc,er,ec,"",maze);
        print(sr,sc-1,er,ec,"",maze);
        print(sr-1,sc,er,ec,"",maze);
        maze[sr][sc]=1;

    }
}
