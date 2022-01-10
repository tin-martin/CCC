/**
Use Collections.sort() to sort weights in ascending order. Print out middle number of sorted array.
**/
import java.util.*;
public class HelloWorld {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] weights = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(weights);
        System.out.println(weights[1]);
   
    }
}
