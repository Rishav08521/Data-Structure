package arrayproblem.java;

public class unique222 {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,3,3,4};
        for(int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<7;i++){
            if (arr[i]>0){
                System.out.println(arr[i]);

            }
        }
       // System.out.println(arr[i]);
    }
}
