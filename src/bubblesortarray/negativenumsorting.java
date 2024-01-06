package bubblesortarray;

public class negativenumsorting {
    static void printarr(int[] arr){
        for (int val:arr){
            System.out.println(val);
        }
        System.out.println();
    }
    static void partation(int [] num){
        int l=0,r=num.length-1;
        while(l<r){
            while(num[l]<0) l++;
            while(num[r]>=0) r--;
            if (l<r){
                int temp=num[l];
                num[l]=num[r];
                num[r]=temp;
                l++;
                r--;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={-13,20,7,0,-4,-13,11,-5,-13 };
        partation(arr);
        printarr(arr);
    }
}
