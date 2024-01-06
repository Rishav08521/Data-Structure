package ARRAY2.O;

public class reversearrayin2 {
    static void reversearr(int[] arr){

        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr={2,4,5,7,8};
        reversearr(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
