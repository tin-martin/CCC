import java.util.*;
import java.lang.*;
//arrays.deepEquals is cool
public class Main {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int R = sc.nextInt();
       int L = sc.nextInt();
       int[][] grid = new int[R][L];
       for(int i=0;i<R;i++){
           for(int j=0;j<L;j++){
               grid[i][j] = sc.nextInt();
           }
       }
       ArrayList<int[]> uppers = new ArrayList<int[]>();
       uppers.add(grid[0]);
       for(int i=1;i<R;i++){
           ArrayList<int[]> lowers = new ArrayList<int[]>();
           int[] lower = grid[i];
           lowers.add(lower);
           
           for(int[] upper : uppers){
               int[] new_row = new int[upper.length];
               for(int j=0;j<upper.length;j++){
                   if( (upper[j] == 1)^(lower[j] == 1)  ){
                       new_row[j] = 1;
                   }else{
                       new_row[j] = 0;
                   }
               }
               boolean isValid = true;
               for(int[] l : lowers){
                   if(Arrays.equals(l,new_row)){
                       isValid = false;
                       break;
                   }
               }
               if(isValid){
                   lowers.add(new_row);
               }
               
               
           }
           uppers = lowers;
           
       }
        System.out.println(uppers.size());
    }
}
