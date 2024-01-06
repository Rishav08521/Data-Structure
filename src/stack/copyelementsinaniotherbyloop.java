package stack;

import java.util.Stack;

public class copyelementsinaniotherbyloop {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            //st.peek();
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
