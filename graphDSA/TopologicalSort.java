package graphDSA;

 import java.util.ArrayList;

 public class TopologicalSort {
     public static class Edge{
        int src ;
        int dest;
        int weight;
        Edge(int src,int dest,int weight)
        {
           this.src=src;
           this.dest=dest;
           this.weight=weight;
        }
     }
    public static void graphcreation(ArrayList<Edge> []graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList();
        }
        graph[0].add(new Edge(0, 0, 0));
        graph[1].add(new Edge(0, 0, 0));
        graph[2].add(new Edge(2, 3, 0));
        
        graph[3].add(new Edge(3, 1, 0));

        graph[4].add(new Edge(4, 0, 0));
        graph[4].add(new Edge(4, 1, 0));

        graph[5].add(new Edge(5, 0, 0));
        graph[5].add(new Edge(5, 2, 0));
 

    }
    public static void main(String [] args)
    {
       int v=6;
       System.out.println("Hlo");
       
       ArrayList<Edge> [] graph = new ArrayList[v];
        graphcreation(graph);
   
        for(int i=0;i<graph[5].size();i++)
        {
            Edge e = graph[5].get(i);
            System.out.print(e.src+" --> "+e.dest);
        }
    } 
 }
