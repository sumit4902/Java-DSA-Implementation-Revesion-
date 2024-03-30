package Graph;
import java.util.*;
 public class BFS {
  
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
        graph[1].add(new Edge(1, 3, 0));
        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 4, 0));
        graph[2].add(new Edge(2, 0, 0));

        graph[3].add(new Edge(3, 5, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 1, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));

    }
      // Traversal BFS 
      public static void  BFS(ArrayList<Edge> [] graph,int V)
      {
           Queue<Integer> q= new LinkedList<>();
           q.add(0);
           boolean [] v = new boolean[V]; // initialize with false //
           while(!q.isEmpty())
           {
              int current = q.remove();
              if(v[current]==false)
             {
                System.out.print(current+"-->");
                v[current]=true;
                for(int i=0;i<graph[current].size();i++)
                {
                    Edge e = graph[current].get(i);
                    q.add(e.dest); 
                }
             }
           }
          
      }

    public static void main(String [] args)
    {
       int v=7; // total number of vertices 
        ArrayList<Edge> [] graph = new ArrayList[v];

        graphcreation(graph);

        for(int i=0;i<graph[4].size();i++)
        {
             Edge edge = graph[4].get(i);
             System.out.println(edge.src+" ----> "+edge.dest);
        }

        // BFS traversal //
        System.out.println();
        BFS(graph,v);
    }
}
