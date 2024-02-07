package ARRAYNEW2024.REVRSEARRAY;

public class negativelemnets {
    public static void removnegative(int[] arr){
        int n=arr.length;
        int[] aa=new int[n];
        int ans=0;
        for (int i=0;i<n;i++) {
            if (arr[i] >= 0)
                aa[ans++]=arr[i];
            if (ans == n || ans == 0)
                return;
        }
            for (int i=0;i<n;i++) {
                if (arr[i] < 0)
                    aa[ans++]=arr[i];
            }
            for (int i=0;i<n;i++){
                arr[i]=aa[ans];
        }
        //System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr={-2,4,-5,-7,9,0,-1};
        removnegative(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
