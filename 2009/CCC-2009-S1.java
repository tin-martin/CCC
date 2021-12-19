import java.util.*;
import java.io.*;
public class test{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sNums = 0;
        for(int i=a;i<=b;i++){
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                if(Math.cbrt(i) == (int)Math.cbrt(i)){
                    sNums ++;
                }
            }
        }
        System.out.println(sNums); 
    }
}
