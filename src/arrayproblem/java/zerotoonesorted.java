package arrayproblem.java;

public class zerotoonesorted {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortedone(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if (arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }

        }
       // printarray(arr);
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,1};
        printarray(arr);
        sortedone(arr);
        System.out.println("sorted array");
        printarray(arr);
       // System.out.println(printarray(arr));

    }
}
