
import java.util.*;
public class test{
    public static String move(String d, String cpos, int n,ArrayList<String> path){
        boolean isSafe = true;
        String[] positions = cpos.split(" ",2);
        
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);
        String s_pos = "";
        //iterates thru all new positions
        for(int i=0;i<n;i++){
            //moves
            switch(d){
                case "u":
                    y ++;
                    break;
                case "d":
                    y --;
                    break;
                case "r":
                    x ++;
                    break;
                case "l":
                    x--;
                    break;
            }
            s_pos = Integer.toString(x) + " " + y;
            //checks
            if (path.contains(s_pos)){
                isSafe = false;
            }
            path.add(s_pos);
        }
        return isSafe ? "safe" : "DANGER";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> traversed = new ArrayList<String>();
        traversed.add("0 -1");  
        move("d",traversed.get(traversed.size()-1),2, traversed);
        move("r",traversed.get(traversed.size()-1),3, traversed);
        move("d",traversed.get(traversed.size()-1),2, traversed);
        move("r",traversed.get(traversed.size()-1),2, traversed); 
        move("u",traversed.get(traversed.size()-1),2, traversed);  
        move("r",traversed.get(traversed.size()-1),2, traversed);    
        move("d",traversed.get(traversed.size()-1),4, traversed);
        move("l",traversed.get(traversed.size()-1),8, traversed);
        move("u",traversed.get(traversed.size()-1),2, traversed);
      
        while(true){
            String s  = sc.next();
            if (s.equals("q")) break;
            int num = sc.nextInt();
            
            String status = move(s,traversed.get(traversed.size()-1),num,traversed);
            String[] coords = traversed.get(traversed.size()-1).split(" ",2);
                  
            System.out.println(coords[0]+" "+coords[1]+ " " + status);
            if (status.equals("DANGER")){
                break;
            }           
        }
    }
}
