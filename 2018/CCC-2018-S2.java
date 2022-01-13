import java.util.*;
import java.lang.*;
public class Main {
    static int[][] rotate(int[][] grid){
        int N = grid.length;
        int[][] newGrid = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                newGrid[j][i] = grid[-i+N-1][j]; 
            }
        }
        return newGrid;
    }
    
    static boolean isValid(int[][] grid){
        boolean valid = true;
        int N = grid.length;
        for(int i=0;i<N-1 && valid==true;i++){
            if(grid[i][0] < grid[i+1][0]){
                valid = true;
            }else{
                valid = false;
            }
        }
        
        for(int i=0;i<N-1 && valid==true;i++){
            if(grid[0][i] < grid[0][i+1]){
                valid = true;
            }else{
                valid = false;
            }
        }
        return valid;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] grid = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        boolean valid = false;
        if(isValid(grid)){
            valid = true;
        }
        for(int i=0;i<3 && valid == false;i++){
            grid = rotate(grid);
            if(isValid(grid)){
                valid = true;
            }
        }
        
        
        
        
        
        
        
        
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                System.out.print(grid[i][j]+ " ");
            }
            System.out.print(grid[i][N-1]);
            System.out.println("");
        }
        
    }
}
