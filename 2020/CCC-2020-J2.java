
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    
    static void solve(Scanner sc){
        int P = sc.nextInt();
        int N = sc.nextInt();
        int R = sc.nextInt();
        int people = N;
        int infected = N*R;
        int day =0;
        while(people <= P){
            people += infected;
            infected *= R;
            day ++;
        }
        System.out.println(day);
    }
    
}    
