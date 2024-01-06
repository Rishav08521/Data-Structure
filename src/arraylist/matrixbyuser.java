package arraylist;

import java.util.Scanner;

public class matrixbyuser {
    static void sum(int arr[][],int arr2[][]){
        int n1=arr.length;
        int m1=arr[0].length;
        int n2=arr2.length;
        int m2=arr2.length;
        if(n1!=n2 || m1!=m2){
            System.out.println("additon is not possible");
            return;
        }else{
            int ans[][]=new int[n1][m1];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    ans[i][j]=arr[i][j]+arr2[i][j];
                }
            }
            System.out.println("additon of both matrix ix");
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    System.out.println(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    static void sub(int arr[][],int arr2[][]){
        int n1=arr.length;
        int m1=arr[0].length;
        int n2=arr2.length;
        int m2=arr2.length;
        if(n1!=n1 || m1!=m2){
            System.out.println("subtraction is not possible");
            return;
        }else{
            int ans[][]=new int[n1][m1];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    ans[i][j]=arr[i][j]-arr2[i][j];
                }
            }
            System.out.println("subtraction of both matrix is");
            for(int i =0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    System.out.println(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    static void multiply(int arr[][],int arr2[][]){
        int n1=arr.length;
        int m1=arr[0].length;
        int n2=arr2.length;
        int m2=arr2.length;
        if(m1!=n2){
            System.out.println("multiplication is not possible");
            return;
        }else{
            int ans[][]=new int[n1][m2];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m2;j++){
                    for(int k=0;k<m1;k++){
                        ans[i][j]+=arr[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("mutliplication of both matrix");
            for(int i=0;i<n1;i++){
                for(int j=-0;i<m2;j++){
                    System.out.println(ans[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("entr the number of rows anf column of first matrix");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int arr[][]=new int[n1][m1];
        System.out.println("enter the elements of the ist matrix");
        for (int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the roews and column of 2nd matrix");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int arr2[][]=new int[n2][m2];
        System.out.println("enter the elements of 2nd matrix");
        for(int i=0;i<n2;i++){
            for(int j=0;i<m2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st matrix");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2nd matrix");
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.println(arr2[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        sum(arr,arr2);
        System.out.println();
        sub(arr,arr2);
        System.out.println();
        multiply(arr,arr2);

    }
}
