// https://dmoj.ca/problem/ccc03s2
import java.util.*;
public class test{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiouAEIOU";
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> lines = new ArrayList<String>();
        for(int i=0;i<n;i++){
            for(int x=0;x<4;x++){
                lines.add(sc.nextLine());
            }
        }

        for(int i=0;i<n;i++){


            ArrayList<String> lastsyllables = new ArrayList<String>();
            for(int x=0;x<4;x++){
                int lastvowelindex = 0;
                String[] currentline = lines.get(i*4+x).toLowerCase().split(" ");
                String currentword = currentline[currentline.length-1];
                
                for(int y=currentword.length()-1;y>=0;y--){ // String.length(), String[].length
                    if (vowels.contains(String.valueOf(currentword.charAt(y)))){
                        
                        lastsyllables.add(currentword.substring(y).toLowerCase());
                        break;
                    }
                }   
                if (lastsyllables.size() != x+1) lastsyllables.add(currentword);
            }

            //perfect
            String poemStatus = "";
            for(int z=0;z<lastsyllables.size()-1;z++){
                if(!lastsyllables.get(z).equals(lastsyllables.get(z+1))){
                    break;
                } else if(z == lastsyllables.size()-2){
                    poemStatus = "perfect"; 
                }
            }
            //even 
            if((poemStatus.equals("")) && lastsyllables.get(0).equals(lastsyllables.get(1)) && lastsyllables.get(2).equals(lastsyllables.get(3))){
                poemStatus = "even";
            }
            //cross 
            if((poemStatus.equals("")) && lastsyllables.get(0).equals(lastsyllables.get(2)) && lastsyllables.get(1).equals(lastsyllables.get(3))){
                poemStatus = "cross";
            }
            //shell 
            if((poemStatus.equals("")) && lastsyllables.get(0).equals(lastsyllables.get(3)) && lastsyllables.get(1).equals(lastsyllables.get(2))){
                poemStatus = "shell";   
            }
            //free 
            if(poemStatus.equals("")){
                poemStatus = "free";
            }
           
            System.out.println(poemStatus);
        }
    }
}
