package graphDSA;
import java.util.*;
public class AllPathFromSourceToDestination {
    public static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int src , int dest, int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
        public static void  creationgraph(ArrayList<Edge> []graph )
        {
             for(int i=0;i<graph.length;i++)
             {
                graph[i]=new ArrayList<>();
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
    

    public static void allPath(ArrayList<Edge> [] graph,boolean [] visited,int current,String path,int target)
    {

        if(current==target)
        {
             System.out.println(path);
             return;
        }
        visited[current]=true;
        for(int i=0 ;i<graph[current].size();i++)
        {
           
            Edge e = graph[current].get(i);
            if(visited[e.dest]==false)
            { 

              allPath(graph, visited, e.dest, path+e.dest , target);
              visited[e.dest]=false;
            }
        }
    }

   public static void main(String[] args) {
      
       int v= 7;
       ArrayList<Edge> []graph = new ArrayList[v];

             creationgraph(graph);
         for(int i=0;i<graph[2].size();i++)
         {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+"-->");
         }    
         System.out.println();
              // Allpath visited Conecept 
         boolean []visited = new boolean[v];
         String path="0";
         int src=0;
         int target=5;
         allPath(graph, visited, src, path, target);
   }

}
