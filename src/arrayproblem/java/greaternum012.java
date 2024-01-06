package arrayproblem.java;

public class greaternum012 {
    public static void main(String[] args) {
        int[] arr={-1,-3,-6,-8,-78};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
