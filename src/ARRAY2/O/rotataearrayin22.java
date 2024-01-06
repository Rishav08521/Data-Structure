package ARRAY2.O;

public class rotataearrayin22 {
    static void reversearr(int[] arr,int i, int j){
        while(i<j){
            int a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            i++;
            j--;
        }
    }
    static void roataearray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reversearr(arr,0,k-1);
        reversearr(arr,k,n-1);
        reversearr(arr,0,n-1);
    }
    public static void main(String[] args) {
        int [] arr={2,3,54,56,6};
        roataearray(arr,2);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
