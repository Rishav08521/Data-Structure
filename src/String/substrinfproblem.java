package String;

public class substrinfproblem {
    public static void main(String[] args) {
        String str="abcd";
        for (int i=0;i<4;i++){
            for (int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }

        }
    }
}
