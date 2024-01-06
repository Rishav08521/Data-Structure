package binaysearch;

public class binarysearchques {
    static boolean binarysearch(int[] a, int target){
        int n=a.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if (target==a[mid]){
                return true;
            } else if (target< a[mid]) {
                end =mid-1;
            }else {
                st=mid+1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int target=0;
        while(target!=10) {
            System.out.print("%d exit in arr:\n"+ binarysearch(a, target));
            target++;
        }

    }
}
