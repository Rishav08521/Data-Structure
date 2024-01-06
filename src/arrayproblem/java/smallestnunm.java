package arrayproblem.java;

public class smallestnunm {
    public static void main(String[] args) {
        int [] arr={0,-1,-6,-3,2,4,6};
        //int smallestnum=-arr.length;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i=1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
