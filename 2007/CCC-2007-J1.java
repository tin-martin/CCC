import java.util.*;
public class test{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] w = {sc.nextInt(), sc.nextInt(),sc.nextInt()};
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(w[0]);
        a.add(w[1]);
        a.add(w[2]);
        Collections.sort(a);
        System.out.println(a.get(1));
    }
}
