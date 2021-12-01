
import java.util.*;
public class test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int minYear = 1989*1000;
    int minMonth = 2*100;
    int minDay = 27;
    int maxSum = minYear + minMonth + minDay;
    
    int intN = sc.nextInt();
    for(int n=0;n<intN;n++){
        int[] date = new int[3];
       
        int year = sc.nextInt()*1000;
        int month = sc.nextInt()*100;
        int day = sc.nextInt();
        
        int sum = year+ month+ day;
        if(sum > maxSum){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
      
        
    }
 }
}
