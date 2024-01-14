package STACK2;

import java.util.Stack;

public class removeconsecutivecons {
    public static int[] remoceconse(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            if (st.size()==0||st.peek()!=arr[i])
                st.push(arr[i]);
            else if (arr[i]==st.peek()){
                if (i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }

        }
        int [] re=new int[st.size()];
        int m=re.length;
        for (int i=m-1;i>=0;i--){
            re[i]=st.pop();
        }
        return re;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7};
        int[] re=remoceconse(arr);
        for (int i=0;i<re.length;i++){
            System.out.print(re[i]+" ");
        }
    }
}
