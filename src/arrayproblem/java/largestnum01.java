package arrayproblem.java;

public class largestnum01 {
    public static void main(String[] args) {
        int[] arr={-2,-3,44,55,666,-75};
        int num=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>num){
                num=arr[i];
            }
        }
        System.out.println(num);
    }
}
