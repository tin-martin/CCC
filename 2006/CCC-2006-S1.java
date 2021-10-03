
import java.util.Scanner;
import java.util.ArrayList;
public class test {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String parentA = sc.nextLine();
       String parentB = sc.nextLine();
       int num = sc.nextInt();
       ArrayList<String> babies = new ArrayList<String>();
       for(int i=0;i<num;i++) babies.add(sc.next());
     
       ArrayList<String> A = new ArrayList<String>();
       ArrayList<String> B = new ArrayList<String>();
       ArrayList<Integer> charsToDelete = new ArrayList<Integer>();
       for(int i=0;i<5;i++){
            String substringA  = parentA.substring(i*2,i*2+2);
            String substringB = parentB.substring(i*2,i*2+2);
            String symbol = substringA.substring(0,1);
            if (substringA.indexOf(symbol.toUpperCase()) != -1){
                if (substringA.lastIndexOf(symbol.toUpperCase()) != substringA.indexOf(symbol.toUpperCase())){
                    A.add(symbol.toUpperCase());
                }else{
                    A.add("*");
                }
            }else{
               A.add(symbol.toLowerCase());
            }
            if (substringB.indexOf(symbol.toUpperCase()) != -1){
                if (substringB.lastIndexOf(symbol.toUpperCase()) != substringB.indexOf(symbol.toUpperCase())){
                    B.add(symbol.toUpperCase());
                }else{
                    B.add("*");
                }
            }else{
               B.add(symbol.toLowerCase());
            }
        }
   
       String alphabet = "abcde";
     
       for (int i=0;i<5;i++){
           String symbol = alphabet.substring(i,i+1);
           String placeA = A.get(i).toString();
           String placeB = B.get(i).toString();
        
           if (placeA.equals("*") && placeB.equals(symbol.toUpperCase())){
               A.set(i,symbol.toUpperCase());
           }else if (placeA.equals(symbol.toUpperCase()) && placeB.equals("*")){
               B.set(i,symbol.toUpperCase());
           }else if ((placeA.indexOf("*") != -1) || (placeB.indexOf("*") != -1)){
               charsToDelete.add(i);
           }
       }
       
       for (int y : charsToDelete){
           for (int x=0;x<babies.size();x++){
           
               String a = babies.get(x).substring(0,y) + " " + babies.get(x).substring(y+1);
               babies.set(x,a);
           }
           A.set(y," ");
           B.set(y," ");
       }
 
       String actual = "";
       for (String i : A){
           actual+= i;
       }
       
       for (String i : babies){
           if (i.equals(actual)){
                System.out.println("Possible baby.");
                
           }else{
               System.out.println("Not their baby!");
           }
       }  
    }
}

