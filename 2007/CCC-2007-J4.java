
import java.util.*;
import java.lang.*;

public class HelloWorld {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       
        char[] s1 = sc.nextLine().replaceAll(" ","").toCharArray();
        char[] s2 = sc.nextLine().replaceAll(" ","").toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        boolean isAnagram = true;
        for(int i=0;i<s1.length;i++){
            if(s1[i] != s2[i]){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Is an anagram.");
        }else{
            System.out.println("Is not an anagram.");
        }
    }
}
            
