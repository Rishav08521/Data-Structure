package GRAPH;

import java.util.ArrayList;

public class dfsgraph {
    public static class edge{
        int sqrc;
        int dest;
        public edge(int s, int d){
            this.sqrc=s;
            this.dest=d;
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
    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;

        for (int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if (vis[e.dest]==false)
            dfs(graph, e.dest, vis);
        }

    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[]=new ArrayList[v];
        creategraph(graph);
        boolean vis[]=new boolean[v];
        for (int i=0;i<v;i++){
            if (vis[i]==false){
                dfs(graph,i,vis);
            }
        }
       // dfs(graph,0,vis);
        System.out.println();


    }
}
