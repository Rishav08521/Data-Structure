package bubblesortarray;

public class countsortinanothermethod {
    static int findmax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void countsort(int[] arr){
        //int n=arr.length;
       // int[] output=new int[n];
        int max=findmax(arr);
        int[] count=new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int k=0;
        for (int i=0;i< count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;

            }
        }
    }
    static void printarr(int[] arr){
        for (int val:arr){
            System.out.println(val);
        }
        System.out.println();
    }
    static void countsorted(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findmax(arr);
        int[] count=new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];

        }
        for (int i=n-1;i>0;i--){
            int index=count[arr[i-1]];
            output[index]=arr[i];
            count[arr[i]]--;
        }
        for (int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,4,2,3,5,6};
        countsorted(arr);
        printarr(arr);

    }
}
