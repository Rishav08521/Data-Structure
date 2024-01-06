package RECURSION22;

public class gcd {
    static int gcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;

        }
        return y;
    }
    public static void main(String[] args) {
        int x=15;
        int y=24;
        int god=gcd(x,y);
        System.out.println(god);

    }
}
