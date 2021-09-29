/**
A while loop will repeat the proceess outlined bellow until the input "halt" is given. 

Create a string array. Each entry is a string which represents a given button's respective characters. (order 
represents button number wheere index 0 is button 2, index 1 is button 3, etc.)

//Find how many pauses Joe Coder woould have to take to write the word
Iterate through all the characters of the input (excluding the last character) and repeat this process:

Iterate over the string array. If the character is found in the given array entry and the next character 
is found in the same array entry, a counter is increased by 2. This counter represents the minimal seconds 
calculated for the word.

//Find how many times Joe Coder has to click the same button to write the characters for the word. 

Iterate through all the characters of the input and repeat this proccess:
Identifythe index of the character in it's respective entry of the string array. Add one to this number. 
(as indexes start at 0) Add this number to the counter.

Save the counter to an outputs ArrayList which is found outside the while loop.


Once the while loop ends the minimal seconds counter for each prior inputs will be outputed and the program will end.
**/

import java.util.Scanner;
import java.util.ArrayList;

public class test{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String[] g = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<Integer> outputs = new ArrayList<Integer>();
        while (true){
            int c = 0;
            String s =  sc.nextLine();
            if (s.equals("halt")){
                break;
            }
            for(int i=0;i<s.length()-1;i++){
                for(int x=0;x<g.length;x++){
                    if (g[x].contains(""+s.charAt(i)) && g[x].contains(""+s.charAt(i+1))){
                        c+= 2;
                    }
                }
            }
            for(int i=0;i<s.length();i++){
                for(int x=0;x<g.length;x++){
                    if (g[x].contains(""+s.charAt(i))){
                        c+= 1+g[x].indexOf(""+s.charAt(i));
                    }
                  
                }
                
            }
            outputs.add(c);  
        }
        for(int i : outputs){
            System.out.println(i);
        }
    }
}
