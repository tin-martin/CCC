import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class test{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
     
        ArrayList<ArrayList<Integer>> blk = new ArrayList<ArrayList<Integer>>();
        
        String[] rj = sc.nextLine().split(" ",4);
        int[] r = {Integer.parseInt(rj[0]), Integer.parseInt(rj[1])};
        int[] j = {Integer.parseInt(rj[2]), Integer.parseInt(rj[3])};
        int num = sc.nextInt();
        
        double rjm;
        try{
            rjm = ((double)r[1]-j[1])/((double)r[0]-j[0]);
        }catch(Exception e){
            rjm = 0;
        } 
        if (Double.isInfinite(rjm) || Double.isNaN(rjm)){
            rjm = 0;
        }
        double rjb = r[1] - rjm*r[0];
  
        
        for(int i=0;i<num;i++){
            int num2 = sc.nextInt();
            String[] t1 = sc.nextLine().strip().split("\\s",num2*2);
            ArrayList<Integer> t2 = new ArrayList<Integer>();
            for(String tt1: t1){
               t2.add(Integer.parseInt(tt1));
            }
            blk.add(t2);
        }
        
       
        for (int i=0;i<num;i++){
            outerloop:
            for(int x=0;x<blk.get(i).size()/2;x++){
                for(int y=0;y<blk.get(i).size()/2;y++){
                    int[] c1 = {blk.get(i).get(2*x), blk.get(i).get(2*x+1)}; 
                    int[] c2 = {blk.get(i).get(2*y),blk.get(i).get(2*y+1)};
                    double cm;
                    try{
                        cm = ((double)c1[1]-c2[1])/((double)c1[0]-c2[0]);
                    }catch(Exception ArithmeticException){
                        cm = 0;
                    }
                    if (Double.isInfinite(cm) || Double.isNaN(cm)){
                        cm = 0;
                    }
                    
                    double cb = c1[1] - cm*c1[0];
                    double xxx;
                    try{
                        xxx = (rjb-cb)/(cm-rjm);
                    }catch(Exception ArithmeticException){
                        xxx = 0;
                    }
                    if(Double.isNaN(xxx) || Double.isInfinite(xxx)){
                        xxx = 0;
                    }
                    
                    double yyy = cm*xxx + cb;
                    if ((yyy == cm*xxx + cb) && (yyy == rjm*xxx + rjb) && (xxx >= Math.min(c1[0],c2[0])) && (xxx <= Math.max(c1[0],c2[0]))){
                        System.out.println(num);
                        break outerloop;
                    }else{
                        
                    }         
                }
            }
        }

    }
}
