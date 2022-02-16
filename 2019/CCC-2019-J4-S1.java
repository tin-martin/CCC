
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for(int t=0;t<T;t++){
            solve(sc);
        }
    }
    
    public static int[][] hFlip(int[][] grid){
        int[][] nGrid = new int[2][2];
        nGrid[0][0] = grid[1][0];
        nGrid[0][1] = grid[1][1];
        nGrid[1][0] = grid[0][0];
        nGrid[1][1] = grid[0][1];
        return nGrid;
    }
    
    public static int[][] vFlip(int[][] grid){
        int[][] nGrid = new int[2][2];
        nGrid[0][0] = grid[0][1];
        nGrid[0][1] = grid[0][0];
        nGrid[1][0] = grid[1][1];
        nGrid[1][1] = grid[1][0];
        return nGrid;
    }
    
    
    
    static void solve(Scanner sc){
        String S = sc.next();
        int[][] grid = {{1,2},{3,4}};
        
        for(int s=0;s<S.length();s++){
            if(String.valueOf(S.charAt(s)).equals("H")){
                grid = hFlip(grid);
            }else{
                grid = vFlip(grid);
            }
        }
        
        for(int r=0;r<2;r++){
            for(int c=0;c<2;c++){
                System.out.print(grid[r][c]+" ");
            }
            System.out.println("");
        }
    }
}    
