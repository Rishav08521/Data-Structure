package ARRAY2.O;

public class maximuminarray2 {
    void mazvalue(){
        int ans=0;
        int[] arr={1,5,3,10,100,19,29};
        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        maximuminarray2 st=new maximuminarray2();
        st.mazvalue();

    }
}
