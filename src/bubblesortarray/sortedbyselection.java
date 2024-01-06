package bubblesortarray;

public class sortedbyselection {
    static void flowersorted(String[] flower){
        int n=flower.length;
        for (int i=0;i<n-1;i++){
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (flower[j].compareTo(flower[minindex])<0){
                    minindex=j;
                }
            }
            String temp=flower[i];
            flower[i]=flower[minindex];
            flower[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        String[] flower={"hibicus","cactus","rose","marogold","sunflower"};
        flowersorted(flower);
        for (String val: flower){
            System.out.println(val);
        }
    }
}
