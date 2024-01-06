package bubblesortarray;

public class insertionsortin22 {
    static void insertedsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }

    }
    public static void main(String[] args) {
        int[] arr={5,2,1,6,8,9,10};
        insertedsort(arr);
        for(int val:arr){
            System.out.println(val);
        }


    }
}
