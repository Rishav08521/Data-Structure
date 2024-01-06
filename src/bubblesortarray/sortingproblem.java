package bubblesortarray;

public class sortingproblem {
    static void printarr(int[] num){
        for (int val:num){
            System.out.println(val);
        }
        System.out.println();
    }
    static void sortingelements(int[] num){
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
        int [] arr={10,5,6,7,8,9,3};
        sortingelements(arr);
        printarr(arr);


    }
}
