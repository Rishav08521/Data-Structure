package GRAPH;

import java.util.ArrayList;

public class cyclicpath {
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
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,0));
       // graph[0].add(new edge(0,1));
       // graph[0].add(new edge(0,1));
       // graph[0].add(new edge(0,1));
    }
    public static boolean cycledirected(ArrayList<edge> graph[],boolean vis[], int curr, boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if (rec[e.dest]){
                return true;
            } else if (!vis[e.dest]) {
               if (cycledirected(graph,vis,e.dest,rec));
                return true;
            }
        }
        rec[curr]=false;
        return false;
    }


    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]=new ArrayList[v];
        creategraph(graph);
        boolean vis[]=new boolean[v];
        boolean rec[]=new boolean[v];
        for (int i=0;i<v;i++){
            if (!vis[i]){
               // System.out.println(cycledirected(graph,vis,0,rec));
                boolean iscycle=cycledirected(graph,vis,0,rec);
                if (iscycle){
                    System.out.println(iscycle);
                    break;
                }

            }
        }


    }
}
