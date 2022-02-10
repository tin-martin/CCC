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
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        
        for(int n=0;n<N;n++){
            String str = sc.next();
            String[] strTemp = str.split(",");
            X.add(Integer.parseInt(strTemp[0]));
            Y.add(Integer.parseInt(strTemp[1]));
        }

        int[] top_left = {Collections.min(X),Collections.max(Y)};
        int[] bottom_right = {Collections.max(X),Collections.min(Y)};
        System.out.println((top_left[0]-1)+","+(bottom_right[1]-1));
        System.out.println((bottom_right[0])+1+","+(top_left[1]+1));
        
        
        
    }
    
}    
