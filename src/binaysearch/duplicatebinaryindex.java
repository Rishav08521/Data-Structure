package binaysearch;

public class duplicatebinaryindex {
    static int duplicateindex(int[] a,int target){
        int n=a.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (a[mid]==target){
                return mid;
            } else if (a[st]==a[mid]&&a[end]==a[mid]) {
                st++;
                end--;
                
            }
            else if (a[mid]<=a[end]) {
                if (target>a[mid]&&target<=a[end]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }

            }else{
                if (target>=a[st]&&target<a[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a={1,2,1,1,2,3,4,3,4,1};
        int target=2;
        System.out.println(duplicateindex(a,target));
    }
}
