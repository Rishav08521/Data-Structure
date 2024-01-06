package RECURSION22;

public class gcdbyequalid {
    static int gcdequlid(int x, int y){
        if (y==0) return x;
        return gcdequlid(y,x%y);
    }
    public static void main(String[] args) {
        int x=15;
        int y=20;
        int ans=gcdequlid(x,y);
        System.out.println(ans);

    }
}
