package array2problem;

public class linearsearch {
    public static void main(String[] args) {
        int ans=-1;
        int key=5;
        int[] arr={2,3,4,5,6};
        for(int i=0;i<5;i++){
            if(arr[i]==key){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
