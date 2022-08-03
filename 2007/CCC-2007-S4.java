
import java.util.*;
import java.io.*;
class Graph{
    int V;
    int[][] graph;
    public Graph(int V){
        this.V = V;
        this.graph = new int[V+1][V+1];
        for(int i=0;i<=this.V;i++){
            for(int j=0;j<=this.V;j++){
                this.graph[i][j] = 0;
            }
        }
    }
    
    public void addEdge(int u, int v){
        this.graph[u][v] = 1;
        //1 represents connection between u to v
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
    public static int dfs(Graph g, int target,int N,int u, HashMap<Integer,Integer> posMoves){
        if(posMoves.containsKey(u)){
            return posMoves.get(u);
        }
        if(u == target){
            posMoves.put(u,1);
            return 1;
        }
        int numPaths = 0;
        Boolean isTerminal = true;
        for(int v=0;v<=N;v++){
             if(g.graph[u][v] > 0){
                isTerminal = false;
                numPaths += dfs(g,target,N,v,posMoves);
             }
        }
        if(isTerminal){
             posMoves.put(u,0);
            return 0;
        }
        posMoves.put(u,numPaths);
        return numPaths;
    }
    public static void main(String[] args) throws IOException{
        int N = readInt();
        int src = 1, target = N;
        int numPaths = 0;
          
        Graph g = new Graph(N);
        while(true){
            int u = readInt();
            int v = readInt();
            if(u == 0 && v == 0){
                break;
            }
            g.addEdge(u,v);
        }
        
        HashMap<Integer,Integer> posPaths = new HashMap<Integer,Integer>();
        
       
       
        System.out.println(dfs(g,target,N,src,posPaths));
    }
    
    
    
    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong () throws IOException {
            return Long.parseLong(next());
    }
    static int readInt () throws IOException {
            return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
            return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
            return next().charAt(0);
    }
    static String readLine () throws IOException {
            return br.readLine().trim();
    }

}
