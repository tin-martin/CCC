import java.util.*;
public class test {
    
    public static int GCD(int a, int b){
        int GCD = 1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i ==0 && b%i ==0){
                GCD = i;
            }
        }
        return GCD;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        int GCD = GCD(numerator,denominator);
        
        if(numerator%denominator ==0){
            System.out.println(numerator/denominator);
            
        }else if(numerator == Math.min(numerator,denominator)){
            System.out.println((numerator%denominator)/GCD +"/"+denominator/GCD);
        }else{
            System.out.println((int)Math.floor((double)numerator/denominator) + " " + (numerator%denominator)/GCD +"/"+denominator/GCD);
        }
    }
}
