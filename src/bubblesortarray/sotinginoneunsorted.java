package bubblesortarray;

public class sotinginoneunsorted {
    static void printarr(int[] arr){
        for (int val:arr){
            System.out.println(val);
        }
        System.out.println();
    }
    static void sortedarr(int[] num){
        int n=num.length;
        int x=-1,y=-1;
        for (int i=1;i<n;i++){
            if (num[i-1]>num[i]){
                if (x==-1){
                    x=-i+1;
                    y=i;
                }else{
                    y=i;
                }
            }
        }
        int temp=num[x];
        num[x]=num[y];
        num[y]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,10,3,4,5,6,7,8,9,2};
        sortedarr(arr);
        printarr(arr);
    }
}
