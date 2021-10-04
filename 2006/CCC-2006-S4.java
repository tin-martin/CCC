/**
Any equation can be checked for given that 
"The qth integer on the pth line of this sequence is the value p * q"

For example:
Associativity is where x,y,z are in G and x * (y*z). = (x*y)*z
Because the (p,q) = p*q, 
x*(y*z) can be rewritten as g[x][y*z] where g is a 2d array which 
represents a group. g[x][y*z] can be rewritten as g[x][g[y][z]] 
as y*z is g[y][z]. 

Following the same logic, (x*y)*z can be rewritten as g[[g[x][y]][z]]

By checking if g[[g[x][y]][z]] == g[x][g[y][z]] applies to
every possible three digit combination of group elements, we are able to check for 
associativity. Similarly, the equation for finding identity and inverses can be 
checked.


For each input to be checked:

1. Check if associativity applies 
  Explanation above ^
  
2. Check for identity
  For every element in the group, (until identity is found) check if 
  x == g[x][i] and x == g[i][x] 
  where i is the selected element and x is every other element in the group.
  If the statements don't apply, go to the next element. If the statements apply i is 
  the identity. 
  If, by the end of this iteration, an identity is not found, the input matrix is not a group.  
  
3. Check for inverses 
  For every element in the group (denoted as x) check if there is 
  a second element in the group (denoted as z) where this equation
  is true:
  g[x][z] ==  i
  where identity is denoted as i
**/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class test{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
      
        while(true){
            int n = sc.nextInt();
            if (n==0)break;
            int[][] g = new int[n+1][n+1];
            boolean isGroup = true;
            
            for (int y=1;y<=n;y++){
                for(int x=1;x<=n;x++){
                    g[y][x] = sc.nextInt();
                    if(g[y][x] < 1 || g[y][x] > n) isGroup = false;
                }
            }
       
             //associative
            for(int x=1;x<=n && isGroup;x++){
                for(int y=1;y<=n;y++){
                    for(int z=1;z<=n;z++){
                        if (g[x][g[y][z]] != g[g[x][y]][z]){
                            isGroup  = false;               
                        }                 
                    }
                }
            }
            
            
            //identity
            int identity = -4;
            boolean found;
            found = true;
            for(int i=1;i<=n && isGroup && identity == -4;i++){
                found = true;
                for(int x=1;x<=n && found;x++){
                    if(g[i][x] != x || g[x][i] != x){
                        found = false;
                    }
                }
                if (found){
                    identity = i;
                }   
            }
            
           // System.out.println(identity);
            isGroup = isGroup && found;
            
            //inverse
            
            for(int inv=1;inv<=n && isGroup;inv++){
                found = false;
                for(int x=1;x<=n && !found;x++){
                    if (g[x][inv] == identity && g[inv][x] == identity){  
                        found = true;
                    }
                }
                if (!found){
                    isGroup = false;
                }
            }
            
            if(isGroup) System.out.println("yes");
            else System.out.println("no");
        }    
    }
}
