package bubblesortarray;

public class insertionsorted {
    static void insersorted(int[] arr ){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int j=i;
            while(j>0 &&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 8, 6, 7, 4};
        insersorted(arr);
        for (int val:arr) {
            System.out.println(val);

        }
    }
}
