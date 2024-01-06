package RECURSION02;

public class igcd {
    static int igcd(int x , int y){
        while (x%y!=0){
            int rem=x%y;
            y=x;
            x=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(igcd(8,6));

    }
}
