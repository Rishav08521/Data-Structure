package bubblesortarray;

public class quicksort222 {
    static void printarray(int[] arr){
        for(int val:arr){
            System.out.println(val);
        }
    }
    static void swaparray(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partation(int[] arr,int st,int end){
        int n=arr.length;
        int pivoted=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivoted) count++;
        }
        int pivotedindex=st+count;
        swaparray(arr,st,pivotedindex);
        int i=st;
        int j=end;
        while(i<pivotedindex&&j>pivotedindex){
            while(arr[i]<=pivoted) i++;
            while(arr[i]>pivotedindex) j--;
            if(i<pivotedindex&&j>pivotedindex){
                swaparray(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotedindex;

    }
    static void quicksorted(int[] arr,int st,int end){
        if(st>=end) return;
        int p=partation(arr,st,end);
        quicksorted(arr,st,p-1);
        quicksorted(arr,p+1,end);
    }
    public static void main(String[] args) {
        int [] arr={6,3,1,4,7,8,9,10};
        System.out.println("before sorted array");
        printarray(arr);
        System.out.println();
       // printarray(arr);
        quicksorted(arr,0,arr.length-1);
        System.out.println("after the sorting");
        printarray(arr);


    }
}
