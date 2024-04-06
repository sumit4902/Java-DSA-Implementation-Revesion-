package graphDSA;
import java.util.ArrayList;
public class AdjacencyList {

    static class Edge{
        int src;
        int dest;
        int weight;

        Edge( int src ,int dest,int weight)
        {
            this.src=src ;
            this.dest= dest;
            this.weight= weight;
        }

    }

     static void graphcreation(  ArrayList<Edge> [] graph)
      {
             for(int i=0;i<graph.length;i++)
             {
                  graph[i]= new ArrayList<>();
             }
         
             graph[0].add(new Edge(0,2,2));
             graph[0].add(new Edge(0,3,3));

             graph[1].add(new Edge(1,2,5));
             graph[1].add(new Edge(1,3,6));

             graph[2].add(new Edge(2,0,1));
             graph[2].add(new Edge(2,1,3));
             graph[2].add(new Edge(2,3,2));

             graph[3].add(new Edge(3,0,6));
             graph[3].add(new Edge(3,1,9));

      }



    
    public static void main(String []args)
    {
         int v=4;
        ArrayList<Edge> [] graph = new ArrayList[v];  // Main concept to be mind //

        graphcreation(graph);

        // I  am going to traverse the  edge 2 neighbours
        for(int i=0;i<graph[2].size();i++)
        {
              Edge edge = graph[2].get(i);
              System.out.println(edge.src+" ---"+edge.weight+"---> "+edge.dest);
        }
    
    }
}
