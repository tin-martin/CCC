
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    
    static String[] get_cycles(String S){
        String[] cycles = new String[S.length()];
        for(int i=0;i<S.length();i++){
            S = S.substring(1) + String.valueOf(S.charAt(0));
            cycles[i] = S;
        }
        return cycles;
    }
    
    static void solve(Scanner sc){
        String T = sc.next();
        String S = sc.next();
        String[] cycles = get_cycles(S);
        for(String cycle : cycles){
            if(T.contains(cycle)){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
        
        
    }
    
}    
