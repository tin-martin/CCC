import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    
    static void solve(Scanner sc){
        //
        int N = sc.nextInt();
        for(int n=0;n<N;n++){
            int num = sc.nextInt();
            String s = sc.next();
            for(int i=0;i<num;i++){
                System.out.print(s);
            }
            System.out.println("");
        }
        
       
    }
}
