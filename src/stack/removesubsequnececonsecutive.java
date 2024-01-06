package stack;

import java.util.Stack;

public class removesubsequnececonsecutive {
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> str=new Stack<>();
        for (int i=0;i<n;i++){
            if(str.size()==0|| str.peek()!=arr[i])
            str.push(arr[i]);
            else  if (arr[i]== str.peek()){
                if(i==n-1||arr[i]!=arr[i+1]) str.pop();
            }
        }
        int[] res=new int[str.size()];
        int m=res.length;
        for (int i=m-1;i>=0;i--){
            res[i]=str.pop();
        }
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");

        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,10,10,10,4,4,4,5,5,6,7,7,7};
        int[] res=remove(arr);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
}
