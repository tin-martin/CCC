//https://dmoj.ca/src/3966365 
import java.util.*;
public class test{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> phonenumbers = new ArrayList<String>();
        String numbers = "0123456789";
        for(int i=0;i<n;i++){
            phonenumbers.add(sc.next().replaceAll("-","").substring(0,10));
        }
        for(int i=0;i<n;i++){ //String.length(), String[].length
            for(int x=0;x<phonenumbers.get(i).length();x++){
                String character = String.valueOf(phonenumbers.get(i).charAt(x));
                if(!numbers.contains(character)){
                    String two = "ABC";
                    String three = "DEF";
                    String four = "GHI";
                    String five = "JKL";
                    String six = "MNO";
                    String seven = "PQRS";
                    String eight = "TUV";
                    String nine = "WXYZ"; 
                
                    if(two.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"2"));
                    if(three.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"3"));
                    if(four.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"4"));
                    if(five.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"5"));
                    if(six.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"6"));
                    if(seven.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"7"));
                    if(eight.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"8"));
                    if(nine.contains(character)) phonenumbers.set(i,phonenumbers.get(i).replace(character,"9"));
                }
            }
        }
        for(int i=0;i<n;i++){
            String currentnumber = phonenumbers.get(i);
            phonenumbers.set(i, currentnumber.substring(0,3) + "-" + currentnumber.substring(3,6) + "-" + currentnumber.substring(6));
            System.out.println(phonenumbers.get(i));
        }

    }
}
