
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Main {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int mod = (int) 1e9+7;
    
    static boolean isRhyme(String s1, String s2){
        s1 = s1.toLowerCase(); s2 = s2.toLowerCase();
        String lastVow1=s1;
        String lastVow2=s2;
        String alph = "aeiou";
        for(int i=s1.length()-1;i>=0;i--){
           
            char c = s1.charAt(i);
            if(alph.contains(String.valueOf(c))){
                
                lastVow1 = s1.substring(i,s1.length());
                break;
            }
        }
        for(int i=s2.length()-1;i>=0;i--){
            char c = s2.charAt(i);
            if(alph.contains(String.valueOf(c))){
                lastVow2 = s2.substring(i,s2.length());
                break;
            }
        }
       
        return lastVow1.equals(lastVow2);
    }
    public static void main(String[] args) throws IOException{

        int T = readInt();
         
        for(int t=0;t<T;t++){
            String[] lines = new String[4];
            for(int i=0;i<4;i++){
                String[] temp = readLine().split(" ");
                lines[i] = temp[temp.length-1];
            }
          
          
            
            if(isRhyme(lines[0],lines[1]) && isRhyme(lines[1],lines[2]) && isRhyme(lines[2],lines[3]) ){
                System.out.println("perfect");
            }else if(isRhyme(lines[0],lines[1]) && isRhyme(lines[2],lines[3])  ){
                System.out.println("even");
            }else if( isRhyme(lines[0],lines[2]) && isRhyme(lines[1],lines[3]) ){
                System.out.println("cross");
            }else if(isRhyme(lines[0],lines[3]) && isRhyme(lines[1],lines[2])  ){
                System.out.println("shell");
            }else{
                System.out.println("free");
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
