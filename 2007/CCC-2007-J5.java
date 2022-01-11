
import java.util.*;
import java.lang.*;

// BRO USE HASHMAP WHEN VALUES CAN BE SORTA STACKED
//ALSO WHY IS IT A LONG EXPLAIN
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int min = sc.nextInt();
       int max = sc.nextInt();
       int N = Integer.valueOf(sc.nextInt());
       ArrayList<Integer> motels = new ArrayList<Integer>();
       motels.add(0);
       motels.add(990); 
       motels.add(1010);
       motels.add(1970);
       motels.add(2030);
       motels.add(2940);
       motels.add(3060);
       motels.add(3930);
       motels.add(4060);
       motels.add(4970);
       motels.add(5030);
       motels.add(5990);
       motels.add(6010);
       motels.add(7000);
       for(int i=0;i<N;i++){
           int num = Integer.valueOf(sc.nextInt());
           motels.add(num);
       }
       Collections.sort(motels);
       
       
       HashMap<Integer,Integer> trucks = new HashMap<Integer,Integer>();
       
       trucks.put(0,1);
        long counter = 0;
        while(!trucks.isEmpty()){
            HashMap<Integer,Integer> new_trucks = new HashMap<Integer,Integer>();
             for(int truck : trucks.keySet()){
                if(truck >= 7000){
                    counter += Long.valueOf(trucks.get(truck));
                    continue;
                }

                for(int motel : motels){
                     if(motel >= (truck+min) && motel <= (truck+max)){
                        if(new_trucks.containsKey(motel)){
                            new_trucks.put(motel,new_trucks.get(motel)+trucks.get(truck));
                        }else{
                            new_trucks.put(motel,trucks.get(truck));
                        }

                    }
                    if(motel > truck+max){
                        break;
                    }
                }
            }
            trucks = new_trucks;
            if(trucks.size() == 0) break;
            
        }
         System.out.println(counter);
     }
}

  
