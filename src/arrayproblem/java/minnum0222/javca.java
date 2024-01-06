package arrayproblem.java.minnum0222;

public class javca {
    public static void main(String[] args) {
        int [] arr={-1,-3,-5,-7,-9,9};
        int min= Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
