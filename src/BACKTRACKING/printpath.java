package BACKTRACKING;

public class printpath {
    public static void main(String[] args) {
        int row=4;
        int cols=6;
        //int count=maze()
        print(1,1,row,cols,"");
    }
    private static void print(int sr,int sc,int er,int ec,String s){
        if(sr>er||sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        print(sr+1,sc,er,ec,s+"D");
        print(sr,sc+1,er,ec,s+"R");
    }
}
