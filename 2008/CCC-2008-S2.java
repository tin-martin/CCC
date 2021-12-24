/*
This problem is simple but I had a hard time with it.

Important:
1. Math.sqrt(r^2 - y^2) = x can be used to calculate the x distance from the y-axis or "center axis of the circle" and any point on the circle's circumference:
a^2+b^2 = c^2 (Pythagorean theorem)
y^2+x^2 = r^2
Math.sqrt(r^2 - y^2) = x
2. A penny circle can be separated into four similar quadrants and an extra penny (reason for the +1 at the end of the calculations)

For each inputed radius, repeat this process:

1. For every whole number y-position from 0 to the radius length (0,1,2,3...R) on the y-axis, calculate the distance from it to a point on the circumference 
with the same y-coordinate. Add the truncated distance to penny count. 
2. Multiply penny count by 4
3. Add 1. 
4. Print out penny count.
*/
import java.util.*;
import java.io.*;
import java.lang.*;
import static java.lang.System.out;
public class test{
        Scanner sc = new Scanner(System.in);
        while(true){
            int r = sc.nextInt();
            if(r == 0){
                break;
            }
            int pennies = 0;
            for(int y=0;y<=r;y++){
                double dist=  Math.sqrt(Math.pow(r,2) - Math.pow(y,2)  );
                pennies += (int)dist;
            }
            pennies = pennies * 4 + 1;
            System.out.println(pennies);
        }  
    }
}
