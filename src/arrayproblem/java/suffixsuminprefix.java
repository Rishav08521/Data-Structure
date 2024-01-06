package arrayproblem.java;

public class suffixsuminprefix {
    static boolean checksuufixinprefix(int[] arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            int suffixsum=totalsum-prefixsum;
            if(suffixsum==prefixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={6,2,4,3,1};
        //checksuufixinprefix(arr);
        System.out.println(checksuufixinprefix(arr));
        for(int val:arr){
            System.out.println(val);
        }

    }
}
