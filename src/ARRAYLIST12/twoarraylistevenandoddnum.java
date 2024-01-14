package ARRAYLIST12;

import java.util.ArrayList;

public class twoarraylistevenandoddnum {
    public static void main(String[] args) {
        ArrayList<Integer> st=new ArrayList<>();
        for (int i=1;i<=10;i++){
            st.add(i);
        }
        ArrayList<Integer>at=new ArrayList<>();
        for (int i=20;i<=30;i++){
            at.add(i);
        }
        ArrayList<Integer> gt=new ArrayList<>();
        for (int i=0;i<st.size();i++){
            if (st.get(i)%2==0){
                gt.add(st.get(i));
            }
        }
        for (int i=0;i<at.size();i++){
            if (at.get(i)%2!=0){
                gt.add(at.get(i));
            }
        }
        System.out.println(gt);
    }

}
