import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int[][] g = new int[n][n];
            ArrayL
            for(int i=0;i<n;i++){
                for(int x=0;x<n;x++){
                    g[i][x] = sc.nextInt();
                }
                
            }
            
            System.out.println(Arrays.deepToString(g));
            
        }
        
    }
}
