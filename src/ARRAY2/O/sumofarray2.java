package ARRAY2.O;

public class sumofarray2 {
    void sumarray(){
        int sum=0;
        int[] arr={1,5,3};
        for(int i=0;i<3;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumofarray2 st=new sumofarray2();
        st.sumarray();

    }
}
