 
import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int c = 0;
        for(int i=0;i<=Math.floor(sum/4);i++){
            for(int j=0;j<=Math.floor(sum/5);j++){
                if(i*4+j*5 == sum){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}  
