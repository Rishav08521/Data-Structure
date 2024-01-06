package binaysearch;

public class binarysearchinseconf222 {
     static  boolean binarysearch(int[] arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(target==arr[mid]){
                return true;
            }if(target<arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
            return false;
        }
    public static void main(String args[]) {
         int [] arr={2,4,51,22,45,22,78,54};
         int target=33;
         binarysearch(arr,target);
         while(target!=100){
             System.out.println(" array"+ binarysearch(arr,target));
             target++;
         }
       // target ++;

    }
}
