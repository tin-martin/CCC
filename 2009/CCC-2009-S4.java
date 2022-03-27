import java.util.*;
import java.lang.*;

class Graph{
    int V;
    int[][] graph;
    public Graph(int V){
        this.V = V; //number of vertices
        this.graph = new int[V][V];
    }
    
    public void addEdge(int a, int b, int weight){
        this.graph[a][b] = weight;
        this.graph[b][a] = weight;
    }
    
    public int minDist(int[] dist, boolean[] spt){
        int minDist = Integer.MAX_VALUE;
        int minIndex = -1; 
        for(int v=0;v<this.V;v++){
            if(!spt[v] && dist[v] < minDist){
                minDist = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    
    public int[] dijkstras(int src){
        boolean[] spt = new boolean[this.V];
        int[] dist = new int[this.V];
        for(int v=0;v<this.V;v++){
            spt[v] = false;
            dist[v] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for(int i=0;i<this.V;i++){
            int u = minDist(dist,spt);
            spt[u] = true;
            for(int v=0;v<this.V;v++){
                if(!spt[v] && this.graph[u][v] > 0 && dist[u]+this.graph[u][v] < dist[v]){
                    dist[v] = this.graph[u][v] + dist[u];
                }
            }
        }
        return dist;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Graph g = new Graph(N);
        
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            g.addEdge(a-1,b-1,c);
        }
  
        int K = sc.nextInt();
        int[] cost = new int[N];
        for(int k=0;k<K;k++){
            int x = sc.nextInt();
            cost[x-1] = sc.nextInt();
        }
        
        int src = sc.nextInt();
        int[] final_cost = new int[N];
        int[] shipping_cost = g.dijkstras(src-1);
        for(int n=0;n<N;n++){
            if(cost[n] != 0){
                final_cost[n] = cost[n] + shipping_cost[n];
            }else{
                final_cost[n] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(final_cost);
        System.out.println(final_cost[0]);

    }
}  
