package ARRAY2.O;

public class ifpresentprintindexothernegative {
    void presentarr(){
        int arr[]={2,3,5,6,3,7};
        int x=3;
        int ans=-1;


        int n=arr.length;
        for(int i=0;i<n;i++){
            if (arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        ifpresentprintindexothernegative st=new ifpresentprintindexothernegative();
        st.presentarr();

    }
}
