package bubblesortarray;

public class quickshorted {

    static void printarr(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
    static void swaparr(int[] arr,int x , int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partation(int[] arr, int st, int end){
        int pivoted=arr[st];
        int count=0;
        for (int i=st +1;i<=end;i++){
            if (arr[i]<=pivoted) count++;
        }
        int pivotindex=st + count;
        swaparr(arr,st,pivotindex);
        int i=st, j=end;
        while(i<pivotindex && j>pivotindex){
            while(arr[i]<=pivoted) i++;
            while(arr[j]>pivoted) j--;
            if (i<pivotindex && j> pivotindex){
                swaparr(arr,i, j);
                i++;
                j--;
            }
        }
        return pivotindex;
    }
    static void quickshort(int[] arr,int st, int end){
        if (st>=end) return;
        int pi=partation(arr,st,end);
        quickshort(arr,st,pi-1);
        quickshort(arr,pi+1,end);



    }
    public static void main(String[] args) {
        int[] arr={2,3,4,56,8,4,1};
        System.out.println("before the shorted");
        printarr(arr);
        System.out.println();
        quickshort(arr,0,arr.length-1);
        System.out.println("after the sorting ");
        printarr(arr);

    }
}
