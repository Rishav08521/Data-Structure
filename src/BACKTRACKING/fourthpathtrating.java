package BACKTRACKING;

public class fourthpathtrating {
    public static void main(String[] args) {
        int row=3;
        int cols=3;
        boolean[][] isvisted=new boolean[row][cols];
        print(0,0,row-1,cols-1,"",isvisted);
    }
    private static void print(int sr,int sc,int er,int ec,String s,boolean[][] isvisited){
        if(sr<0||sc<0) return;
        if(sr>er||sc>ec) return;
        if(isvisited[sr][sc]==true) return;

        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        isvisited [sr][sc]=true;
        print(sr,sc+1,er,ec,s+"D",isvisited);
        print(sr+1,sc,er,ec,s+"R",isvisited);
        print(sr,sc-1,er,ec,s+"L",isvisited);
        print(sr-1,sc,er,ec,s+"U",isvisited);
        isvisited[sr][sc]=false;
    }
}
