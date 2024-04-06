package graphDSA;

 import java.util.*;

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
       
        graph[2].add(new Edge(2, 3, 0));
        
        graph[3].add(new Edge(3, 1, 0));

        graph[4].add(new Edge(4, 0, 0));
        graph[4].add(new Edge(4, 1, 0));

        graph[5].add(new Edge(5, 0, 0));
        graph[5].add(new Edge(5, 2, 0));
 

    }
         public static void topoSort(ArrayList<Edge> []graph,int current ,boolean []visited , Stack<Integer> st  )
         {
           
                 visited[current]=true;
           for(int i=0;i<graph[current].size();i++)
           {
            Edge e = graph[current].get(i);
            if(!visited[e.dest])
            {
                topoSort(graph, e.dest, visited,st);
            } 
           }
           st.push(current);
         }

    public static void main(String [] args)
    {
       int v=6;
     
       
       ArrayList<Edge> [] graph = new ArrayList[v];
        graphcreation(graph);
   
        for(int i=0;i<graph[5].size();i++)
        {
            Edge e = graph[5].get(i);
            System.out.println(e.src+" --> "+e.dest);
        }
        boolean visited [] = new boolean[v];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<visited.length;i++)
        {     
            if(!visited[i])
            {
                topoSort(graph, i,visited, st);
            }
           
        }
       while(!st.isEmpty())
       {
        System.out.println(st.pop());
       }
    } 
 }
