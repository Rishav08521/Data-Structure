package bubblesortarray;

public class selectionsorted {
    static void selectionsort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){  //i represnt the current index
            // find the minimum element in unsorted part of array
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            // swap current element and minimu,m elements;
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={90,8,9,6,25};
        selectionsort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
