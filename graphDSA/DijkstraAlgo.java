package graphDSA;
import java .util.*;
public class DijkstraAlgo {
    
      
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src,int dest,int weight )
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }}
   // pair 
   public static class Pair  implements Comparable<Pair>{
    int node ;
    int distance;
    Pair(int node,int distance)
    {
        this.node=node;
        this.distance= distance;
    }
    @Override
    public int compareTo(Pair p2)
    {
        return this.distance-p2.distance;
    }
   }

    public static void graphcreation(ArrayList<Edge> []graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1 ,2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3)); 
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    
    public static void dijkstra(ArrayList<Edge> graph[],int start)
    {
        Queue<Pair> q = new PriorityQueue<>();
        boolean visited[]=new boolean[graph.length];
        int d[] =new int[graph.length];
       for(int i=0;i<d.length;i++)
       {  
           if(i!=start)
           {
            d[i]=Integer.MAX_VALUE;
           }
         
       }

        q.add(new Pair(0,0));
        while(!q.isEmpty())
        {
            Pair current = q.remove();  // it will give sorted element
               if(visited[current.node]==false)
               {
                 
                  //add neighbours
                  for(int i=0;i<graph[current.node].size();i++)
                  {
                    Edge e = graph[current.node].get(i);
                    int u = e.src;
                    int v=  e.dest;
                    if(d[u]+e.weight<=d[v]) 
                    {
                        d[v]=d[u]+e.weight;
                    }
                    q.add(new Pair(v, d[v]));
                  }
               }
        }
         // to print the shortest distance from source to particular Node //
    
        printdistance(d);
    }


     public static void printdistance(int dist[])
     {
            for(int i=0;i<dist.length;i++)
            {
                System.out.println(0+"--->"+i+" = "+dist[i]);
            }
     }

   public static void main(String[] args) {
    int v=6;
    ArrayList<Edge> [] graph = new ArrayList[v];

    graphcreation(graph);
    /// to check the graph is connected or not 
    for(int i=0;i<graph[4].size();i++)
    {
        Edge e= graph[4].get(i);
        System.out.println(e.src+"--->"+e.dest);
    }
      System.out.println("shortest distance from source to particular Node");
      
      
     dijkstra(graph,0);
     
    

   }
}
