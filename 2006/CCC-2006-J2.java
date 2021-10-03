/**
Iterate through all possible combinations of dice scores.
If scores equals 10, a counter increases by 1
At the end, print the counter
**/
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.io.*;
public class test{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int counter = 0;
        for(int i=0;i<m;i++){
            for(int x=0;x<n;x++){
                if (i+x+2 == 10) counter += 1;
            }
        }
        System.out.println("There are " + counter + " ways to get the sum 10");
    }
}
