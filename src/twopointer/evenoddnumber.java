package twopointer;

public class evenoddnumber {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void evenoddnum(int[] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<end){
            if (arr[st] % 2 == 1 && arr[end] % 2 == 0){
                int a=arr[st];
                arr[st]=arr[end];
                arr[end]=a;
                st++;
                end--;
            }
            else if (arr[st]%2==0){
                st++;
            }
            else if(arr[end]%2==1){
                end--;
            }
        }
    }
    public static void main(String[] args) {
     int[] arr={1,2,4,3,6,8,9};
     evenoddnum(arr);
     printarr(arr);
    }
}
