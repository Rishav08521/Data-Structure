import java.util.ArrayList;
import java.util.Collections;

public class sdkf {
    public static void main(String[] args) {
        int arr[] = {0,0,2,1,1};

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = arr.length;
        int x = 3;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    ArrayList<Integer> a = new ArrayList<>();
                    for(int l=k+1; l<n; l++){
                        int s = arr[i]+arr[j]+arr[k]+arr[l];
                        if(s==x){
                            a.add(arr[i]);
                            a.add(arr[j]);
                            a.add(arr[k]);
                            a.add(arr[l]);
                        }
                    }
                    if(a.size()!=0){
                        ans.add(a);
                    }

                }
            }
        }
        System.out.println(ans);
    }
}
