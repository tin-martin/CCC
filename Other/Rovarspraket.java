
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String vow = "aeiou";
        String alph  = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> list  = new ArrayList<String>();
        for (int i=0;i<s.length();i++){
            if(!vow.contains(""+s.charAt(i))){
            
                String closest = String.valueOf(vow.charAt(0));
                for(int x=1;x<vow.length();x++){
                    String c = String.valueOf(s.charAt(i));
                    String v = String.valueOf(vow.charAt(x));
                    if (Math.abs(c.compareTo(v))< Math.abs(c.compareTo(closest))){
                        if (Math.abs(c.compareTo(v)) == Math.abs(c.compareTo(closest))){
                            if (c.compareTo(v)<0) closest  = v;
                        }else{
                            closest = v;
                        }
                    }
                }
                String closestCons = "";
                String malph = alph.substring(alph.indexOf(s.charAt(i))+1);
      
                for(int y=0;y<malph.length();y++){      
                    
                    if (!(vow.contains(""+malph.charAt(y)))){  
                        closestCons += String.valueOf(malph.charAt(y));
                        break;
                    }
                    
                }
                list.add(Integer.toString(i));
                list.add(closest+closestCons);
            }
        }
        String output = s.substring(0, Integer.parseInt(list.get(0)+1)) + list.get(1); 
        for(int i=1;i<list.size()/2;i++){
            int startindex = Integer.parseInt(list.get(i-1))+1;
            int endindex = Integer.parseInt(list.get(i+1))+1;
            
            output += s.substring(startindex,endindex) + list.get(i+2);   
        } 
        try{
            output += s.substring(Integer.parseInt(list.get(list.size()-2))+1);
        }catch (Exception e){
        }
        System.out.println(output);   
    }
}
