package HEAP;

import java.util.ArrayList;
import java.util.List;

public class minheap {
   private static void swap(List<Integer> heap,int l, int r){
        int temp=heap.get(l);
        heap.set(l , heap.get(r));
        heap.set(r,temp);
    }
    private static void push_in_min(List<Integer> heap, int i){
    int parent=(i-1)/2;
    if (i==0 || heap.get(parent)<heap.get(i)){
        return;
    }
    swap(heap,i,parent);

    }
    private static void minheap(List<Integer> heap, int element){
        heap.add(element);
        int index= heap.size()-1;
        push_in_min(heap,element);
    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        minheap(heap,5);
        System.out.println(heap);


    }
}
