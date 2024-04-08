package graphDSA;
import java.util.*;

public class PrimsAlgo {
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight = weight;
        }
    }
    public static void graphcreation(ArrayList<Edge> []graph)
    {
         for(int i=0;i<graph.length;i++)
         {
            graph[i]=new ArrayList<>();
         }
         graph[0].add(new Edge(0, 1, 10));
         graph[0].add(new Edge(0, 2, 15));
         graph[0].add(new Edge(0, 3, 30));
         
         graph[1].add(new Edge(1, 0, 10));
         graph[1].add(new Edge(1, 3, 40));

         graph[2].add(new Edge(2, 0, 15));
         graph[2].add(new Edge(2, 3, 30));

         graph[3].add(new Edge(3, 1, 40));
         graph[3].add(new Edge(3, 0, 30));
         graph[3].add(new Edge(3, 2, 50));
    }
    public static class Pair implements Comparable<Pair>{  // kisi bhi class ke object ko sort krne ke liye hame comprable class ka use krna padta hai //
        int node;
        int cost;
        Pair(int node, int cost)
        {
           this.node=node;
           this.cost=cost;
        }
        @Override
        public int compareTo( Pair p2)
        {
            return this.cost-p2.cost;
        }
    }
    public static void primsAlgo(ArrayList<Edge> []graph, int v )
    {
        Queue<Pair> q =new PriorityQueue<>();
        boolean []visited = new boolean[v];
        q.add(new Pair(0, 0));
        int mstcost = 0;
        while(!q.isEmpty())
        {
            Pair current = q.remove();
            if(!visited[current.node])
            {
               visited[current.node]=true;
                mstcost+=current.cost;
            
                for(int i=0;i<graph[current.node].size();i++)
                {
                    Edge e = graph[current.node].get(i);
                    if(!visited[e.dest])
                    {
                        q.add(new Pair(e.dest,e.weight));
                    }
                }
            }

        }

           System.out.println("Cost of minimum spanning Tree : "+mstcost);
    }
    public static void main(String args[])
    {
        int v=5;
        ArrayList<Edge> []graph = new ArrayList[v];
        graphcreation(graph);
        // for(int i=0;i<graph[0].size();i++) // to check the graph 
        // {
        //     Edge e = graph[0].get(i);
        //     System.out.println(e.dest);
        // }
          primsAlgo(graph, v);
    }
}







