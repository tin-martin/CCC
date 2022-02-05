import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
        
    static void solve(Scanner sc){
        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] cols = new int[N];
        int[] rows = new int[M];
        for(int n=0;n<N;n++){
            cols[n] = 0;
        }
        for(int m=0;m<M;m++){
            rows[m] = 0;
        }
        
        for(int k=0;k<K;k++){
            String str = sc.next();
            int index =sc.nextInt()-1;
            if(str.equals("R")){
                if(rows[index] == 0){
                    rows[index] = 1;
                }else{
                    rows[index] = 0;
                }
                
            }else{
                if(cols[index] == 0){
                    cols[index] = 1;
                }else{
                    cols[index] = 0;
                }
            }
        }
        int filled = 0;
        for(int m=0;m<M;m++){
            for(int n=0;n<N;n++){
                if(rows[m]+ cols[n] == 1){
                    filled++;
                }
            }
        }
        System.out.println(filled);
    }
}    
