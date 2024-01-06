package arrayproblem.java;

public class maxnum022 {
    public static void main(String[] args) {
        int [] arr={-1,2,3,455,78,94,1000};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            //System.out.println(max);
        }
        System.out.println(max);
    }
}
