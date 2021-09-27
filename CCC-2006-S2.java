import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String codedin = sc.nextLine();
        String codedout = sc.nextLine();
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String ciph = "                           ";
        for (int i=0;i<in.length();i++){
            int index = alph.indexOf(in.charAt(i));
            ciph = ciph.substring(0,index) + codedin.charAt(i) + ciph.substring(index+1);
        }
        for(int i=0;i<codedout.length();i++){
            System.out.print(alph.charAt(ciph.indexOf(codedout.charAt(i))));         
        }
        
        
       
       
    }
}
