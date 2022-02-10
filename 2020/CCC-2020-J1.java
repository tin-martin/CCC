
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    
    static void solve(Scanner sc){
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int hap = 1*s+2*m+3*l;
        if(hap >= 10){
            System.out.println("happy");
        }else{
            System.out.println("sad");
        }
        
        
    }
    
}    
