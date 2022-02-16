
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    
    static void solve(Scanner sc){
       int a = sc.nextInt()*3 + sc.nextInt()*2 + sc.nextInt()*1;
       int b = sc.nextInt()*3 + sc.nextInt()*2 + sc.nextInt()*1;

       if(a==b){
           System.out.println("T");
       }else if(a>b){
           System.out.println("A");
       }else if(a<b){
           System.out.println("B");
       }
       
    }
}    
