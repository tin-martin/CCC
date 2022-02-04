
import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
        
    static void solve(Scanner sc){
        int N = sc.nextInt();
        //Queue<Integer> queue = new PriorityQueue<>();
        int[] H = new int[N+1];
        int[] B = new int[N];
        for(int h=0;h<H.length;h++){
            H[h] = sc.nextInt();
        }
        for(int b=0;b<B.length;b++){
            B[b] = sc.nextInt();
        }
        double a = 0;
        for(int n=0;n<N;n++){
            int h1 = H[n];
            int h2 = H[n+1];
            int b = B[n];
            a += ((double)b*(h1+h2)/2);
        }
        System.out.println(a);
        
        
        
        
        
    }
}    
