
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       double[] villages = new double[N];
       for(int i=0;i<N;i++){
           villages[i] = (double)sc.nextInt();
       }
       Arrays.sort(villages);
       Double min = Double.MAX_VALUE;
       for(int i=1;i<N-1;i++){
            double village_size = (villages[i]-villages[i-1])/2.0 +(villages[i+1]-villages[i])/2.0;
            if(village_size < min){
                min = village_size;
            }
       }
       min = Math.round(min*10D)/10D;
       System.out.println(String.format("%.5f", min));
    }
}

  
