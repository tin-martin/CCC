import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int n=0;n<N;n++){
            String line = sc.nextLine();
            int counter = 1;
            String letter = String.valueOf(line.charAt(0));
            
            for(int i=1;i<line.length();i++){
                if(String.valueOf(line.charAt(i)).equals(letter)){
                    counter++;
                }else{
                    System.out.print(counter + " " + letter + " ");
                    counter = 1;
                    letter = String.valueOf(line.charAt(i));
                }
            }
            System.out.println(counter + " " + letter + " ");
        }
        
        
    }
}
