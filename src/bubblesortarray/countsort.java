package bubblesortarray;

public class countsort {
    static int findmax(int [] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return  mx;
    }
    static void basiccountsort(int[] arr){
        int max=findmax( arr);
        int[] count =new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }

    }
    static void displayarr(int[] arr){
        for (int val:arr){
            System.out.println(val);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,3,3,2,5,5,8};
        basiccountsort(arr);
        displayarr(arr);

    }
}
