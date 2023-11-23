import java.util.HashMap;
import java.util.HashSet;

class Graphcl{
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graphcl(int v){
        map=new HashMap<>();
        for(int i=0;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }

    public void AddEdges(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);

    }
    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdg(int v1){
        int ans=0;
        for(int nbrs : map.keySet()){
            ans+= map.get(nbrs).size();
        }
        return ans/2;
    }

     public void removeEdges(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);

    }

    public void reovevertex(int v1){
        for(int nbr : map.get(v1).keySet()){
            map.get(nbr).remove(v1);
        }
        map.remove(v1);
    }

    public void Display(){
        for(int key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }

    public boolean haspath(int src,int des,HashSet<Integer> vis){
        if(src==des){
          return true;
        }
       vis.add(src);
        for(int nbrs: map.get(src).keySet()){

            if(!vis.contains(nbrs)){
            boolean ans=haspath(nbrs, des,vis);
            if(ans){
                return ans;
            }
        }
    }

        return false;
    }


    public  void printallpath(int src,int des,HashSet<Integer> vis,String ans){
         if(src==des){
         System.out.println(ans+des);
        }
        vis.add(src);
        for(int nbrs: map.get(src).keySet()){

            if(!vis.contains(nbrs)){
          printallpath(nbrs, des,vis,ans+src);
        }
      }
      vis.remove(src);
    }
}