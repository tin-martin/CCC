import java.util.*;
public class HelloWorld {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("CU","see you");
        map.put(":-)","I'm happy");
        map.put(":-(","I'm unhappy");
        map.put(";-)","wink");
        map.put(":-P","stick out my tongue");
        map.put("(~.~)","sleepy");
        map.put("TA","totally awesome");
        map.put("CCC","Canadian Computing Competition");
        map.put("CUZ","because");
        map.put("TY","thank-you");
        map.put("YW","you're welcome");
        map.put("TTYL","talk to you later");
        String s = sc.nextLine();
        while(true){
            if(s.equals("TTYL")){
                System.out.println("talk to you later");
                break;
            }
            
            String out = map.get(s);
            if(out == null){
                System.out.println(s);
            }else{
                System.out.println(out);
            }
            s = sc.nextLine();
        }
       
    }
}
