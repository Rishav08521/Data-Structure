package twopointer;

public class zeroandonesoretd {
    static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void zeroonesoret(int[] arr){
        int n=arr.length;
        int zeros=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
              zeros++;
            }
        }
        for (int i=0;i<n;i++){
            if (i<zeros){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,0,1,1,0};
        //System.out.println();
       // printarray(arr);
        zeroonesoret(arr);
        printarray(arr);

    }
}
