package graphDSA;
import java.util.*;

public class BellmanfordAlgo {
  
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src ,int dest, int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }}

        public static void graphcreation(ArrayList<Edge> []graph)
        {
            for(int i=0;i<graph.length;i++)
            {
                graph[i]=new ArrayList<>();
            }

          // let's go to the connectivity
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
           
            graph[1].add(new Edge(1, 2, -4));

            graph[2].add(new Edge(2, 3, 2));
            graph[3].add(new Edge(3, 4, 4));

            graph[4].add(new Edge(4, 1, -1));





        }
         // bellmanford 

         public static void bellmanford(ArrayList<Edge> [] graph,int start,int V)
         {
             int []d = new int[V];

             for(int i=0;i<d.length;i++)  // Number of Iteration    O(v)
             {   
                if(i!=start){    
                d[i]=Integer.MAX_VALUE;}
             }

             for(int k=0;k<V-1;k++)   // Dynamicly find th distance from each node to desti //
             {                            //O(E)
                for(int i=0;i<V;i++)  // this node got the neighbour and update the distance //
                {
                    for(int j=0;j<graph[i].size();j++)
                    {
                        Edge e = graph[i].get(j);
                        int u = e.src;
                        int v = e.dest;
                        int w = e.weight;

                       if(d[u]!=Integer.MAX_VALUE && d[u]+w<d[v])
                       {
                        d[v]=d[u]+w;
                      } 
                    }
                }
             }

             // these loops for the Neative Weight cycle 
            

                for(int i=0;i<V;i++)  
                {
                    for(int j=0;j<graph[i].size();j++)
                    {
                        Edge e = graph[i].get(j);
                        int u = e.src;
                        int v = e.dest;
                        int w = e.weight;

                       if(d[u]!=Integer.MAX_VALUE && d[u]+w<d[v])
                       {
                          System.out.println("Negative weight cycle present in the graph");
                      } 
                    }
                }
             


             // print the minimum distance 
             for( int i=0;i<d.length;i++)
             {
                System.out.println(0+"-->"+i+" = "+ d[i]);
             }
         }

    public static void main(String [] args)
    {
        int v=5;
        ArrayList<Edge> []graph = new ArrayList[v];

        graphcreation(graph);
        for(int i=0;i<graph[0].size();i++)
        {
            Edge e= graph[0].get(i);
            System.out.println(e.src+"-->"+e.dest);
        }
        bellmanford(graph, 0, v);
    }
}
