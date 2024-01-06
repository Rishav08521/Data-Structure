package bubblesortarray;

public class radixsort {
    static int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countsort(int[] arr){
        int mx=findmax(arr);
        int[] count=new int[mx+1];
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
    static void displaya(int[] arr){
        for (int val:arr){
            System.out.println(val);
        }
        System.out.println();
    }
    static void countso(int[] arr,int place){
        int n=arr.length;
        int[] output=new int[n];
       // int m=findmax(arr);
        int[] count =new int[10];
        for (int i=0;i<arr.length;i++){
            count[arr[i]/place]++;
        }
        for (int i=1;i< arr.length;i++){
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
    static void radixsort(int [] arr){
       int max=findmax(arr);
       for (int place=1;max/place>0;place*=10){
           countso(arr,place);
       }
    }
    public static void main(String[] args) {
        int [] arr={3,4,3,2,5,5,6};
        radixsort(arr);
        displaya(arr);

    }
}
