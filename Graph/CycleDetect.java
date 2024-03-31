package Graph;
import java.util.*;
public class CycleDetect {
 
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src ,int dest,int weight)
        {
            this.src=src;
            this.dest= dest;
            this.weight= weight;
        }

    }

    public static void graphcreation(ArrayList<Edge> [] graph)
    {
       for(int i=0;i<graph.length;i++)
       {
          graph[i]=new ArrayList<>(); // it will create the null list at each index
       }
         
        graph[1].add(new Edge(1, 0, 0));
        graph[0].add(new Edge(0, 2, 0));
        graph[2].add(new Edge(2, 3, 0));
        graph[2].add(new Edge(2, 4, 0));
        graph[3].add(new Edge(3, 0, 0));
        graph[4].add(new Edge(4, 3, 0));

    }

    public static boolean isCycleDetected(ArrayList<Edge> []graph , boolean []visited,int current,boolean []st)
    {
        visited[current]=true;
        st[current]=true;

        for(int i=0;i<graph[current].size();i++)
        {
            Edge e = graph[current].get(i);

            if(st[e.dest]==true)
            {
                return true;
            }
            else if(visited[e.dest]==false)
            {
                if(isCycleDetected(graph, visited, e.dest, st))
                {
                    return true;
                }
            }
        }

         st[current]=false;

        return false;
    }

    public static void main(String []args)
    {
       int v=5;
       ArrayList<Edge> []graph = new ArrayList[v];

       graphcreation(graph);

       for(int i=0;i<graph[2].size();i++)
       {
         Edge e = graph[2].get(i);
         System.out.print(e.dest+"-->");
       }
       System.out.println();
       System.out.println("Cycle Detection");
  
         boolean  []visited = new boolean[v];
         boolean   []st = new boolean[v];
         int start=0;
         if(isCycleDetected(graph, visited, start, st))
         {
            System.out.println("Cycle Detected");
         }
         else{
            System.out.println("Cycle is not Detected");
         }
         
       
    }
}
