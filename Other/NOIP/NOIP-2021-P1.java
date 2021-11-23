import java.util.*;
public class test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    
    for(int t=0;t<T;t++){
        boolean skip = false;
        int num = sc.nextInt();
        
        if(num % 7 == 0 || Integer.toString(num).contains("7")){
            skip = true;
        }
        
        for(int i=1;i<num/2+1 && skip==false;i++){
            if(num % i ==0){
                if(i % 7 == 0 || Integer.toString(i).contains("7")){
                    skip = true;
                }
                
        }
                
        if(skip){
            System.out.println("-1");
            continue;
        }
        
        
        skip = false; 
        num++;
        while(true){
            if(num % 7 == 0 || Integer.toString(num).contains("7")){
                skip = true;
            }
        
            for(int i=1;i<num/2+1 && skip==false;i++){
                
                if(num % i == 0){
                    if(i % 7 == 0 || Integer.toString(i).contains("7")){
                        skip = true;
                    }
                }
                
            }
          
            if(skip){
                num++;
                skip = false;
            }else{ 
                System.out.println(num);
                break;
            }
            
            
        }
        
  
    }
 }
}
}
