
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException{
        int N = readInt();
        double[][] timeToDisplacement = new double[N][2];
        for(int n=0;n<N;n++){
            timeToDisplacement[n] = new double[]{readInt(),readInt()};
        }
        Arrays.sort(timeToDisplacement, new Comparator<double[]>(){
            public int compare(double[]a,double[]b){
                return Double.compare(a[0],b[0]);
            }
        });
        double maxSpeed = Double.MIN_VALUE;
        for(int i=1;i<timeToDisplacement.length;i++){
            double tempSpeed = (timeToDisplacement[i][1]-timeToDisplacement[i-1][1])/(timeToDisplacement[i][0]-timeToDisplacement[i-1][0]);
            tempSpeed = Math.abs(tempSpeed);
            if(tempSpeed > maxSpeed){
                maxSpeed = tempSpeed;
            }
        }
        System.out.println(maxSpeed);
       
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

}
