package recursion;

import java.util.Scanner;

public class factorialnum {
    static int fact(int n){
        if (n == 0){
            return 1;
        }
        int ans = n*(fact(n-1));
      //  int smallans = fact(n-1);
      //  int ans = n* smallans;
        //System.out.println(n);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //fact(n);
        System.out.println(fact(n));

        //System.out.println(fact(5));

    }
}
