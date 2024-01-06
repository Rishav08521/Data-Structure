package RECURSION22;

public class lcm {
    static int lcm(int x , int y){
        if (y==0) return x;
        else
            return  lcm(y,x%y);

    }
    public static void main(String[] args) {
        int x=  15;
        int y=20;
        int ans =lcm(x,y);
        System.out.println(ans);


    }
}
