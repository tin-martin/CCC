
import java.util.*;
public class test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int minYear = 1989;
    int minMonth = 2;
    int minDay = 27;
    
    int intN = sc.nextInt();
    for(int n=0;n<intN;n++){
        int[] date = new int[3];
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(year < minYear){
            System.out.println("Yes");
        }else if(year > minYear){
            System.out.println("No");
  
        }else if(year == minYear){
            if(month < minMonth){
                System.out.println("Yes");
    
            }else if(month > minMonth){
                System.out.println("No");
        
            }else{
                if(day < minDay || day == minDay){
                    System.out.println("Yes");
        
                }else{
                    System.out.println("No");
                }
            }
        }
        
    }
 }
}
