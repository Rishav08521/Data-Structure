package twopointer;

public class sortedmethodsecond {
    static void pritarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sotedarray(int[] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<end){
            if (arr[st]==1 && arr[end]==0){
                int a= arr[st];
                arr[st]=arr[end];
                arr[end]=a;
                st++;
                end--;
            }
            if (arr[st]==0){
                st++;
            }
            if (arr[end]==1){
                end--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,0,1,0,1,0};
        sotedarray(arr);
        pritarr(arr);

    }
}
