
import java.util.*;
import java.lang.*;
/**
 * 
 *   int[][] arr = {{5,1},{2,3}};
        Arrays.sort(arr, new Comparator<int[]>(){
                public int compare(int[] a, int[]b){
                    return Integer.compare(a[0], b[0]);
                }

        });
        System.out.println(Arrays.deepToString(arr));
 * @author martintin
 */

public class HelloWorld {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ammounts = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
        
        int N = sc.nextInt();
        
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            ammounts[num-1] = 0;
            
        }
        
        int sum = Arrays.stream(ammounts).sum();
        int avg = sum/(ammounts.length-N);
        int deal = sc.nextInt();
        if(deal > avg){
            System.out.println("deal");
        }else{
            System.out.println("no deal");
        }
        
       
    }
}
            
