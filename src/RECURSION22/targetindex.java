package RECURSION22;

public class targetindex {
    static void indexsearch(int [] arr, int target, int idx){
        if (idx>=arr.length) return;
        if (arr[idx]==target){
            System.out.println(idx);
        }
        indexsearch(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,3,5,2,6,2};
        int target=2;
        indexsearch(arr,target,0);

    }
}
