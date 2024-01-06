package arrayproblem.java;

public class zerosandones {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void zerones(int[] arr){
        int n=arr.length;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }

        }
        for(int i=0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }else{

            }
            arr[i]=1;
        }
        //System.out.println(arr);
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,0,1,0,0,0};
        printarray(arr);
        zerones(arr);
        System.out.print("sorted array");
        //zerones(arr);
        printarray(arr);

    }
}
