package arrayproblem.java;

import java.sql.SQLOutput;


class ofarray {
    void searchingarray(){
        int[] arr3 = {1,2,3,4,3,6,3,8,9};
        int x=3;
        int ans=-1;
        for (int i=0;i<arr3.length;i++){
            if (arr3[i]== x){
                ans=i;
                break;
            }
        }
        System.out.println("found "+ x +" at index " + ans);
    }
    void maxofarray(){
        int[] arr2={2,4,5,6,7,8,9,10};
        int ans=0;
        for (int i=0;i<arr2.length;i++){
            if (arr2[i] > ans){
                ans=arr2[i];

            }
        }
        System.out.println(ans);
    }
    void sumofarray(){
        int[] arr= {1,2,4};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
    void multiplearray(){
        //int[][] arr1 = new int[4][5];
        int[][] arr2 = {{35,45,56,},{43,67,89},{41 ,25 ,79}};
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[1][2]);
        System.out.println(arr2.length);
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                System.out.println(arr2[i][j]);

            }
           // System.out.println(arr2[2]);
        }
    }
    void demoarr() {
        int[] ages = new int[3];
        String[] name = {"rishav","ravi","raj",};
        float[] weight = new float[3];

        ages[0] = 13;
        ages[1] = 23;
        ages[2] = 35;

        //name[0] = "rishav";
        //name[1] = "ravi";
        name[2] = "abhishek";
        weight[0]=12.2f;
        weight[1] = 34.45f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(weight[0]);
        System.out.println(ages.length);
        System.out.println(name.length);
        System.out.println(weight.length);
        for (int i=0;i<3;i++){
            System.out.println(ages[i]);
        }


    }
}

public class demoarray {
    public static void main(String[] args) {
        ofarray obj = new ofarray();
        //obj.demoarr();
        //obj.multiplearray();
        //obj.sumofarray();
        //obj.maxofarray();
        obj.searchingarray();
    }
}


