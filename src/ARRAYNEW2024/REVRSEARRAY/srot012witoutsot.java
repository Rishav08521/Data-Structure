package ARRAYNEW2024.REVRSEARRAY;

public class srot012witoutsot {
    public static void sort(int[] arr) {
        int b0 = 0;
        int b1 = 0;
        int b2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) b0++;
            else if (arr[i] == 1) {
                b1++;
            } else b2++;
        }
//        for (int i=0;i<n;i++)
//        System.out.print(arr);
        int k = 0;
        for (int i = 0; i < b0; i++) arr[k++] = 0;
        for (int i = 0; i < b1; i++) arr[k++] = 1;
         for (int i = 0; i < b2; i++) arr[k++] = 2;
         for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
//            //System.out.println(arr);
             //System.out.print(k +" ");
            }
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,0,2,0,1,0,1,1,0};
        sort(arr);

    }
}
