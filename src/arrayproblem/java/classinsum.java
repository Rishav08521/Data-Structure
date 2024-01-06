package arrayproblem.java;

import java.util.Scanner;

class algebra{
    int add(int a,int b){
        int ans = a + b;
        return ans;
    }
}

public class classinsum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        algebra obj = new algebra();
        int a  =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of integer");

         int ans = obj.add(a,b);
        System.out.println(ans);

    }
}
