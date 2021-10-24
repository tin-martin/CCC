/**
Use Collections.sort() to sort weights in ascending order. Print out middle number of sorted array.
**/
import java.util.*;
public class test{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] w = {sc.nextInt(), sc.nextInt(),sc.nextInt()};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(w[0]);
        arr.add(w[1]);
        arr.add(w[2]);
        Collections.sort(a);
        System.out.println(a.get(1));
    }
}
