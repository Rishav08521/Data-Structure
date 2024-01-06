package recursion;

public class subsetsum {
    static void subsetsum(int[] arr,int n, int index,int currsum){
        if (index>=n){
            System.out.println(currsum);
            return;
        }
        subsetsum(arr,n,index+1,currsum + arr[index]);
        subsetsum(arr,n,index+1,currsum);
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        int index =0;
        int currsum=0;
        int n= arr.length;
        subsetsum(arr,n,index,currsum);

    }
}
