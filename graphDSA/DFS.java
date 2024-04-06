package graphDSA;

import java.util.*;

public class DFS {

    public static class Edge{
        int src ;
        int dest;
        int weight;
        Edge( int src ,int dest, int weight)
        {
         this.src=src;
         this.dest= dest;
         this.weight=weight;
        }
      }
  
      public static void graphcreation(ArrayList<Edge> [] graph)
      {
          for(int i=0;i<graph.length;i++)
          {
              graph[i]= new ArrayList<>();
          }
  
          graph[0].add(new Edge(0, 1, 0));
          graph[0].add(new Edge(0, 2, 0));
          graph[1].add(new Edge(1, 0, 0));
          graph[1].add(new Edge(1, 3, 0));
         
  
          graph[2].add(new Edge(2, 0, 0));
          graph[2].add(new Edge(2, 4, 0));
         
  
          graph[3].add(new Edge(3, 1, 0));
          graph[3].add(new Edge(3, 4, 0));
          graph[3].add(new Edge(3, 5, 0));
         
          graph[4].add(new Edge(4, 2, 0));
          graph[4].add(new Edge(4, 3, 0));
          graph[4].add(new Edge(4, 5, 0));
  
          graph[5].add(new Edge(5, 3, 0));
          graph[5].add(new Edge(5, 4, 0));
          graph[5].add(new Edge(5, 6, 0));
  
          graph[6].add(new Edge(6, 5, 0));
  
      }

      public static void DFS( ArrayList<Edge> [] graph , int current ,boolean [] visited )
      {
        System.out.print(current+"-->");
        visited[current]=true;

        for(int i=0;i<graph[current].size();i++)
        {
            Edge e= graph[current].get(i);
            if(visited[e.dest]==false)
            {
                DFS(graph, e.dest, visited);
            }
        }
      }





    public static void main(String [] args)
   { //           1 --- 3
     //         /       |  \
    //         0        |   5---6
    //          \       |  /
    //           2 ---- 4
    //
    
    int v=7; // total number of vertices 
        ArrayList<Edge> [] graph = new ArrayList[v];

        graphcreation(graph);

         for(int i=0;i<graph[4].size();i++)
         {
              Edge edge = graph[4].get(i);
              System.out.println(edge.src+" ----> "+edge.dest);
         }
         System.out.println();
         System.out.println("DFS Traversal");
        //DFS traversal 
        boolean [] visited = new boolean[v];
        DFS(graph, 0, visited);
   }
}
