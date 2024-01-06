package binaysearch;

public class distributedchocklate {
    static boolean isdivionchock(int[] r,int m,int chock){
        int numofstuedent=1;
        int chocklate=0;
        for (int i=0;i<r.length;i++){
            if (r[i]>chock) return false;
            if (chocklate+r[i]>=chocklate){
                chocklate+=r[i];
            }else{
                numofstuedent++;
                chocklate=r[i];

            }
        }
        return numofstuedent<=m;

    }
    static int chocklate(int[] a,int m){
        if (a.length<m) return -1;
        int ans=0;
        int st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (isdivionchock(a,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={5,3,1,4,2 };
        int m=3;
        System.out.println(chocklate(arr,m));
    }
}
