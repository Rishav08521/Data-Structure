package RECURSION02;

public class alternatesigsum {
    static int seriessum(int n){
        if (n==0) return 0;
        int sum=seriessum(n-1)+n;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(seriessum(5));

    }
}
