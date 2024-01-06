package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsgraph {
    public static class edge{
        int src;
        int dest;
       // int wat;
        public edge(int s, int d){
            this.src=s;
            this.dest=d;
           // this.wat=w;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(1,4));

        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,2));
        graph[4].add(new edge(4,3));
        graph[4].add(new edge(40,5));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

    }
    public static void bsf(ArrayList<edge> graph[], int v){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[] =new boolean[v];
        q.add(0);
        while (!q.isEmpty()){
            int curr=q.remove();
            if (vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for (int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<edge> graph[]=new ArrayList[v];
        creategraph(graph);
        bsf(graph,v);
        System.out.println();
    }
}
