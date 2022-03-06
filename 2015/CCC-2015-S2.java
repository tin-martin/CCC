
import java.util.*;
import java.lang.*;

public class Main {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for(int t=0;t<T;t++){
            solve(sc);
        }
        
    }
    
    static void solve(Scanner sc){
        int J = sc.nextInt();
        int A = sc.nextInt();
        String[] jerseys = new String[J];
        for(int j=0;j<J;j++){
            jerseys[j] = sc.next();
        }
        
        int output = 0;
        
        for(int a=0;a<A;a++){
            String size = sc.next();
            int jNum = sc.nextInt()-1;    
            if((jerseys[jNum].equals("L") || jerseys[jNum].equals("M") || jerseys[jNum].equals("S") ) && size.equals("S")){
                jerseys[jNum] = "T";
                output ++;  
            }else if((jerseys[jNum].equals("L") || jerseys[jNum].equals("M")) && size.equals("M")){
                jerseys[jNum] = "T";
                output ++; 
            }else if(jerseys[jNum].equals("L") && size.equals("L")){
                jerseys[jNum] = "T";
                output ++; 
            }
        }
        System.out.println(output);
        
        
        
    }
    
    
    
}  
