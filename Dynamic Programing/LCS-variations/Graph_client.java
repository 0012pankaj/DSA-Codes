public class Graph_client {
     public static void main(String []args){
        Graphcl g=new Graphcl(7);
        g.AddEdges(1, 4, 6);
        g.AddEdges(1, 2, 10);
        g.AddEdges(2, 3, 7);
        g.AddEdges(3, 4, 5);
        g.AddEdges(4, 5, 1);
        g.AddEdges(5, 6, 4);
        g.AddEdges(7, 5, 2);
          g.AddEdges(6, 7, 3);
          g.Display();
     }
}
