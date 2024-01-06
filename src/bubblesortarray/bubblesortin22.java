package bubblesortarray;

public class bubblesortin22 {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,344,1,5,7,89,9};
        bubblesort(arr);
       // System.out.println();
        for(int val:arr){
            System.out.println(val);
        }

    }
}
