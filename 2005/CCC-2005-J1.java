import java.util.*;
public class test{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int daytime = sc.nextInt();
        int evening = sc.nextInt();
        int weekend = sc.nextInt();
        int costA = 0;
        int costB = 0;
        if(! (daytime<=100)) costA += 25*(daytime-100);
        if(!(daytime<=250)) costB += 45*(daytime-250);
        //daytime
        costA += 15*evening;
        costB += 35*evening;
        //evening
        costA += 20*weekend;
        costB += 25*weekend;
        
        System.out.println("Plan A costs "+ (double)costA/100);
        System.out.println("Plan B costs "+ (double)costB/100);
        
        if(costA < costB) System.out.println("Plan A is cheapest.");
        else if (costB < costA) System.out.println("Plan B is cheapest.");
        else System.out.println("Plan A and B are the same price.");
     
    }
}
