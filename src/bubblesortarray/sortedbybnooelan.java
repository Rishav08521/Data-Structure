package bubblesortarray;

public class sortedbybnooelan {
    static void doreted(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
                if (!flag){
                    return;
                }
            }

    }
    public static void main(String[] args) {
        int [] arr={2,4,9,1,3};
        doreted(arr);
        for (int i:arr){
            System.out.println(i);
        }

    }
}
