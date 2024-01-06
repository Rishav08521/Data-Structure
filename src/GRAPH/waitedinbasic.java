package GRAPH;

import java.util.ArrayList;

public class waitedinbasic {
    static class edge{
        int src;
        int dest;
        int wait;
        edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wait=w;
        }
    }
    public static void creategraph(ArrayList<edge>graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,2,3));
        graph[1].add(new edge(1,2,5));
        graph[1].add(new edge(1,2,5));
        graph[2].add(new edge(2,0,10));
        graph[2].add(new edge(2,3,14));
        graph[2].add(new edge(2,1,17));
        graph[3].add(new edge(3,1,28));
        graph[3].add(new edge(3,2,52));

    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];
        creategraph(graph);
        for (int i=0;i<graph[2].size();i++){
            edge e=graph[2].get(i);
            System.out.println(e.dest+","+e.wait);
        }

    }
}
