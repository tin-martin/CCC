
import java.util.*;
import java.io.*;

public class Main {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int mod = (int) 1e9+7;
 
    public static void main(String[] args) throws IOException{
       String numbers = "1234567890";
       String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String in = next();

       String tempStr = "";
       String action = "";
       String num = "";
       for(int i=0;i<in.length();i++){
      
           if(alph.contains( String.valueOf(in.charAt(i))  )){
               tempStr += String.valueOf(in.charAt(i));
           }else if(in.charAt(i) == '+' || in.charAt(i) == '-'){
  
               action = in.charAt(i) == '+' ? "tighten" : "loosen";
               inner:for(int j=i+1;j<in.length();j++){
                   
                   if(numbers.contains(String.valueOf(in.charAt(j)))){
                      
                       num += String.valueOf(in.charAt(j));
                       
                   }else{
                         i=j-1;
                       break;
                      
                      
                      }
               }
                System.out.printf("%s %s %s\n", tempStr, action, num);
                tempStr = "";
                action = "";
                num = "";
                     
                  
                      
           }
           
      }
    }
    
    
    
    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong () throws IOException {
            return Long.parseLong(next());
    }
    static int readInt () throws IOException {
            return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
            return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
            return next().charAt(0);
    }
    static String readLine () throws IOException {
            return br.readLine().trim();
    }
    static int readLongLineInt() throws IOException{
        int x = 0, c;
        while((c = br.read()) != ' ' && c != '\n')
            x = x * 10 + (c - '0');
        return x;
    }
    static long pow (long x, long exp){
        if (exp==0) return 1;
        long t = pow(x, exp/2);
        t = t*t %mod;
        if (exp%2 == 0) return t;
        return t*x%mod;
    }
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    // find first one grater, return list.size() if everything is smaller than or equal to v
    static int upperBound(List<Integer> list, int v) {
        int lo = 0, hi = list.size()-1;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if (list.get(mid)>v) {
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return lo;
    }
    // find first one smaller, return -1 if everything is greater then or equal to v
    static int lowerBound(List<Integer> list, int v) {
        int lo = 0, hi = list.size()-1;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if (list.get(mid)>=v) {
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return hi;
    }

}
