import java.util.*;
public class test{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int RSA = 0;
        for(int i=min;i<=max;i++){
            int f = 0;
            for(int x=1;x<=i;x++){
                if (i%x==0) f++;
            }
            if(f==4) RSA ++;
        }
        System.out.println("The number of RSA numbers between "+ min+ " and "+max+" is "+ RSA);
    }
}
