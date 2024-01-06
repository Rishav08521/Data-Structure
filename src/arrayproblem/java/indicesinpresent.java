package arrayproblem.java;

public class indicesinpresent {
    public static void main(String[] args) {
        int [] arr={1,3,4,5,6,7,8,9,5};
        int x=5;
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] ==x){

                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
