package RECURSION22;

public class targetsearch {
    static boolean lineartarget(int[] arr, int target, int idx){
        if (idx>=arr.length) return true;
        if (arr[idx]==target) return true;
        if (lineartarget(arr,target,idx+1)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,8,3};
        int target=4;
        if (lineartarget(arr,target,0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
