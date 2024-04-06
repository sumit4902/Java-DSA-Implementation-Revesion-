package graphDSA;
import java.util.*;
public class CycleDetectiondirectedgrapgh {
    
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

          public static void graphcreation(ArrayList<Edge> []graph )
          {
              for(int i=0;i<graph.length;i++)
              {
                graph[i] = new ArrayList<>(); 
              }

              graph[0].add(new Edge(0, 1, 0));
              graph[0].add(new Edge(0, 2, 0));

              graph[1].add(new Edge(1, 0, 0));
              graph[1].add(new Edge(1, 2, 0));

              graph[2].add(new Edge(2, 0, 0));
              graph[2].add(new Edge(2, 3, 0));
          }
    
          public static boolean Cycledetect(ArrayList<Edge> []graph,boolean []visited,int current,int parent)
          {
                visited[current]=true;
                
                for(int i=0;i<graph[current].size();i++)
                {
                    Edge e = graph[current].get(i);
                      if(visited[e.dest]==true&& e.dest!=parent)
                      {
                          return true;
                      }
                      else if(visited[e.dest]==false&& e.dest!=parent)
                      {
                        if(Cycledetect(graph, visited,e.dest, current))
                        {
                            return true;
                        }
                      }
                }
                return false;
          }

    public static void main(String [] args )
    {
        int v=4;
        ArrayList<Edge> [] graph = new ArrayList[v];

        graphcreation(graph);

        for(int i=0;i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i);
            System.out.println(e.src+"-->"+e.dest);
        }

        int parent= -1;
        boolean []visited = new boolean[v];

         if(Cycledetect(graph, visited, 0, parent))
         {
            System.out.println("Cycle is detected");
         }
         else{
            System.out.println("Cycle is not detected");
         }
    }
}
