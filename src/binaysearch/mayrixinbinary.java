package binaysearch;

public class mayrixinbinary {
    static boolean matricsearch(int[][] a,int target) {
        int n = a.length, m = a[0].length;
        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midelt = a[mid / m][mid % m];
            if (midelt == target) return true;
            if (target < midelt) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return false;

    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,},{4,5,6},{7,8,9}};
        int target=4;
        System.out.println(matricsearch(arr,target));


    }
}
