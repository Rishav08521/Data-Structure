package BACKTRACKING;

public class mazeproblem {
    public static void main(String[] args) {
        int row=2;
        int cols=2;
        int count=maze(1,1, row ,cols);
        System.out.println(count);

    }
    private static int maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int dowanways=maze(sr+1,sc,er,ec);
        int rightways=maze(sr,sc+1,er,ec);
        int totalways=dowanways + rightways;
        return totalways;

    }
}
