package bubblesortarray;

public class selectionsortquestion {
    static void sortfruits(String[] fruits){
        int n=fruits.length;
        for (int i=0;i<n-1;i++){
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (fruits[j].compareTo(fruits[minindex])<0){
                    minindex=j;
                }

            }
            String temp=fruits[i];
            fruits[i]=fruits[minindex];
            fruits[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","mango","orange"};
        sortfruits(fruits);
        for (String val:fruits){
            System.out.println(val);
        }
    }
}
