package ARRAY2.O;

public class frequencyarray {
    static int[] makefreq(int[] arr){
        int[] freq=new int[10005];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int[] arr={2,3,3,2,1,4};
       int[] ans= makefreq(arr);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}
