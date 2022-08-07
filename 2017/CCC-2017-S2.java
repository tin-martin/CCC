
 
import java.util.*;
import java.io.*;

public class Main {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int mod = (int) 1e9+7;
 
    public static void main(String[] args) throws IOException{
        int N = readInt();

        Integer[] samples = new Integer[N];
        for(int n=0;n<N;n++){
            samples[n] = readInt();
        }
        Arrays.sort(samples);
        int lowPoint; 
        int highPoint; 
        if(N % 2 == 0){
            lowPoint = N/2-1;
            highPoint = N/2;
        }else{
            lowPoint = (int)(N/2D) ;
            highPoint = (int)(N/2D)+1;
        }
        while(lowPoint >= 0 || highPoint <= N-1){
            if(lowPoint >= 0){
                System.out.print(samples[lowPoint]);
                System.out.print(" ");
                lowPoint--;
            }
            
            if(highPoint <= N-1){
                System.out.print(samples[highPoint]);
                System.out.print(" ");
                 highPoint++;
            }
            
            
        }
        
       
    }
    // 1,2,3,4,5
    //
    
    
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
