package bubblesortarray;

public class dextionarywordselsctionsort {
    static void dicti0narrsort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

    }
    public static void main(String[] args) {
        int[] arr={2,200,200,1,10,3,30,404};
        dicti0narrsort(arr);
        for (int val:arr){
            System.out.println(val);
        }
    }
}
