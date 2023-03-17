import java.util.*;
public class Main {
    
    static boolean flag=false;
    public static void printans(int[][] ans)
    {
        for(int i=0;i<ans.length;i++){
            
        for(int j=0;j<ans[0].length;j++)
        {
           System.out.print(ans[i][j]+" ");
        }
        System.out.println();
        }
          System.exit(0);
    }
    
    public static void printmaze(char[][] maze ,int cr,int cc,int[][] ans)
    {   //base case
        if(cc == maze[0].length-1 && cr == maze.length-1  )
        {   if(maze[cr][cc]=='O'){
            flag=true;
             ans[cr][cc]=1;

             printans(ans);
             ans[cr][cc]=0;  
           }
             
             return;        
   
        }

        if(cc<0 || cc>=maze[0].length || cr<0 || cr>= maze.length || maze[cr][cc]=='X')
        {
            return;
        }

        int r[]={0,1};
        int c[]={1,0};
                                                                                  //due to four calls we use loop and extra arrays for row and col  4 direction
        maze[cr][cc]='X'; 
        ans[cr][cc]=1; 
        
        for(int i=0;i<c.length;i++)
        {  printmaze(maze,cr+r[i],cc+c[i],ans);
        }
                                                                      
        maze[cr][cc]='O'; 

        ans[cr][cc]=0; 
        
    
    }

    public static void main(String args[]) {

      Scanner sc=new Scanner(System.in);
   
   
      int n=sc.nextInt();

      int m=sc.nextInt();

       char [][] maze=new char[n][m];
      for(int i=0;i<n;i++)
      {
          String s=sc.next();
          for(int j=0;j<s.length();j++)
          {
             maze[i][j]=s.charAt(j);
          }
           
      }
    

      int ans[][]=new int[n][m];

      printmaze(maze,0,0,ans);
    
      if(!flag){

      System.out.print("-1");
      }
      
    }
}