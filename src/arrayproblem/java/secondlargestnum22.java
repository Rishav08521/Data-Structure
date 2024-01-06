package arrayproblem.java;

public class secondlargestnum22 {
    int largestidx(int [] arr,int size){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<size;i++){
            if (arr[i]>max){
                arr[i]=max;
                maxidx=1;
            }
        }
        return maxidx;

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,7,6,1};

    }
}
