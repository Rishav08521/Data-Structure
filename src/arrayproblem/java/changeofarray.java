package arrayproblem.java;

public class changeofarray {
    static void changearray(int [] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=0;
        }

    }

    public static void main(String[] args) {
        System.out.println("enter the size of array");
        int[] arr=new int[3];
         arr[0] = 2;
         arr[1]=3;
         arr[2]=5;
         changearray(arr);
        // int arr=arr.clone;

         for (int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }


    }
}
