package recursion;

public class frogproblem {
    static int bestway(int[] height,int n,int index){
        if (index==n-1) return 0;
        int opt1=Math.abs(height[index]-height[index+1])+bestway(height,n,index+1);
        if (index==n-2) return opt1;
        int opt2=Math.abs(height[index]=height[index+2])+bestway(height,n,index+2);
        return Math.min(opt1,opt2);

    }
    public static void main(String[] args) {
        int[] height={10,30,40,20};
        int index=0;
        int n=height.length;
        System.out.println(bestway(height,n,index));

    }
}
