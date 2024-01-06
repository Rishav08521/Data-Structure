package recursion2;

public class countodgigit {
    static int countdigit(int n){
        int count =0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countdigit(23677));
    }
}
