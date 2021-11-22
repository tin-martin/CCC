import java.util.*;
public class test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Z = sc.nextInt();    
    for(int z=0;z<Z;z++){
        int N = sc.nextInt();
        ArrayList<Integer> mtop = new ArrayList<Integer>();
        ArrayList<Integer> branch = new ArrayList<Integer>();
        ArrayList<Integer> lake = new ArrayList<Integer>();   
        for(int n=0;n<N;n++){
            mtop.add(sc.nextInt());
        }
        int count = 1;
        boolean isN = false;
        while(count <= N){
            try{
                if(mtop.get(mtop.size()-1) == count){
                    lake.add(mtop.get(mtop.size()-1));
                    mtop.remove(mtop.size()-1);
                    count ++;
                    continue;
                }
            }catch(Exception e){}
            
            try{
                if(branch.get(branch.size()-1) == count){
                    lake.add(branch.get(branch.size()-1));
                    branch.remove(branch.size()-1);
                    count ++;
                    continue;
                }
            }catch(Exception e){}
            
            try{
                branch.add(mtop.get(mtop.size()-1));
                mtop.remove(mtop.size()-1);
            }catch(Exception e){
                isN = true;
                System.out.println("N");
                break;
            }
        }
        if(!isN){
            System.out.println("Y");
        }   
    }   
 }
}
