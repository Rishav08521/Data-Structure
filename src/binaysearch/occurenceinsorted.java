package binaysearch;

public class occurenceinsorted {
    static int firstoccurence(int[] a,int x ){
        int n=a.length;
        int st=0,end=n-1;
        int fo=-1;
        while(st<=end) {
            int mid = st + (end - st) / 2;
            if (a[mid]==x){
                fo=mid;
                end=mid-1;
            }else if (x<a[mid]){
                end =mid-1;

            }else{
                st=mid+1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr={1,5,5,5,6,4,2};
        int x=5;
        System.out.println(firstoccurence(arr,x));
    }
}
