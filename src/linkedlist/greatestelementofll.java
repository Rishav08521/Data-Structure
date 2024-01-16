package linkedlist;
 class node {
     int data;
     node next;

     node(int data) {
         this.data = data;
     }
 }
public class greatestelementofll {
     static int bit(String s){
         int n=s.length();
         int ans=0;
         int x=0;
         for (int i=n-1;i>=0;i--){
             char ch=s.charAt(i);
             if (ch=='1'){
                 ans=ans+1*(int)Math.pow(2,x);
                 x++;
             }else{
                 ans=ans+0*(int)Math.pow(2,x);
                 x++;
             }
         }
         return ans;
     }


    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(2);
        node c=new node(1);
        int ans=bit("101");
        System.out.println(ans);



    }
}
