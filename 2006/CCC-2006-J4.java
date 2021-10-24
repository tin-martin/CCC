//EXTREMLY EXTREMELY INCOMPLETE
import java.util.*;
public class test{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7};
        
        ArrayList<Integer> order = new ArrayList<Integer>();
        ArrayList<Integer> instructions = new ArrayList<Integer>();
        
        int[] originalinstructions = {1,7,1,4,2,1,3,4,3,5};
        for(int i=0;i<originalinstructions.length;i++){
            instructions.add(originalinstructions[i]);
        }
        while(true){
            int before = sc.nextInt();
            if(before==0) break;
            int after = sc.nextInt();
            instructions.add(before);
            instructions.add(after);
        }
       
        for(int i=0;i<numbers.length;i++){
            String potentialfirsts = "1234567";
            for(int x=0;x<order.size();x++){
                potentialfirsts = potentialfirsts.replace(Integer.toString(order.get(x)), "");
            }
            for(int x=0;x<instructions.size()/2;x++){
                int before = instructions.get(x*2);
                int after = instructions.get(x*2+1);
                potentialfirsts = potentialfirsts.replace(Integer.toString(after),"");
           
            }
         
           
            if(potentialfirsts.length() == 1){
                order.add(Integer.parseInt(String.valueOf(potentialfirsts.charAt(0))));
                
            }else{
                int minimum = 8;
                for(int x=0;x<potentialfirsts.length();x++){
                    int placeholder = Integer.parseInt(String.valueOf(potentialfirsts.charAt(x)));
                    if (placeholder < minimum){
                        minimum = placeholder;
                    }   
                }
                order.add(minimum);   
               
            }
            
            for(int x=0;x<instructions.size()/2;x++){
                int before = instructions.get(x*2);
                int after = instructions.get(x*2+1);
                if (before == order.get(i)){       
                    instructions.set(x*2,69);
                    instructions.set(x*2+1,69);    
                }
            }
            
            while(instructions.contains(69)){
                instructions.remove(instructions.indexOf(69));
            }
           
        }
       
       
        //identify all of the last instructios
        //find instructions not in the before position
        //add to position of the order array
        //removeo all instructions iwth the thigy
        if(order.contains(8)){
            System.out.println("Cannot complete these tasks. Going to bed.");
        }
        else{
            for(int i=0;i<order.size();i++) System.out.println(order.get(i));
        }
    
    }
}
