package RECURSION22;

public class multiople {
    static int multiple(int x, int y){
        if (y==0) return 0;
        else return x + multiple(x,y-1);
    }
    public static void main(String[] args) {
        int x=2;
        int y=290;
        int ans=multiple(x,y);
        System.out.println(ans);

    }
}
