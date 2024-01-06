package arrayproblem.java;

public class findarrayinindex4 {
    static int indexarr(int[] arr,int x){
        int n=arr.length;
        for (int i=0;i<=n;i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
       // int x=

        System.out.println(indexarr(arr,8));
        System.out.println(indexarr(arr,5));

    }

}
