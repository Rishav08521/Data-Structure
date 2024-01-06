package binaysearch;

public class binarysaerchinanother {
    static boolean recursionbinary(int[] a,int st,int end,int target){
        if (st>end) return false;
        int mid=(st+end)/2;
        if (target==a[mid]) {
            return true;
        }else if (target<a[mid]){
            return recursionbinary(a,st,mid-1,target);
        }else {
            return recursionbinary(a,st+1,end,target);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int st=0;
        int end= a.length-1;
        int target=0;
        while(target!=10){
            System.out.println(recursionbinary(a,st ,end,target));
            target++;
        }
        //System.out.println(recursionbinary(a,st,end,target));

    }
}
