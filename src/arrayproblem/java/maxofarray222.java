package arrayproblem.java;

public class maxofarray222 {
    public static void main(String[] args) {
        int max=0;
        int [] arr={-1,2,43,56,7,9,10};
        for(int i=0;i<6;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
