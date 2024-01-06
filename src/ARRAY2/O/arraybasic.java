package ARRAY2.O;

public class arraybasic {
    void multiplearray(){
        int[][] arr3={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr3[0][0]);
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0][2]);
        System.out.println(arr3[1][0]);
        System.out.println(arr3[1][1]);
        System.out.println(arr3[1][2]);
        System.out.println(arr3[2][0]);
        System.out.println(arr3[2][1]);
        System.out.println(arr3[2][2]);
    }
    void demoarrays(){
        int arr[]=new int[3];
        float arr1[]=new float[2];
        String arr2[]=new String[2];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr1[0]=9;
        arr1[1]=8;
        arr2[0]="rishav";
        arr2[1]="aayushi";
//        System.out.println(arr[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr2[1]);
//        System.out.println(arr.length);
//        System.out.println(arr2.length);
//        //System.out.println();
       for (int i=0;i<2;i++){
            System.out.print(arr1[i]);
       }
    }

    public static void main(String[] args) {
        arraybasic st=new arraybasic();
       // st.demoarrays();
        st.multiplearray();

    }
}
