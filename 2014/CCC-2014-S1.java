import java.util.*;
public class test{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        
        int[] r = new int[m];      
        for(int i=0;i<m;i++){
            r[i] = sc.nextInt();
        }
        
        ArrayList<Integer> invitees = new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            invitees.add(i+1);
        }
        
   
        for(int i=0;i<m;i++){
            int factor = r[i];
            ArrayList<Integer> toBeRemoved = new ArrayList<Integer>();
            
            for(int x=0;x<invitees.size();x++){
                if(((x+1) % factor) == 0){
                    toBeRemoved.add(invitees.get(x));
                }
            }
            
            for(int x=0;x<toBeRemoved.size();x++){
                invitees.remove(Integer.valueOf(toBeRemoved.get(x)));
            }
                
            
            
        }
        for(int i=0;i<invitees.size();i++){
            System.out.println(invitees.get(i));
        }
    }
}
