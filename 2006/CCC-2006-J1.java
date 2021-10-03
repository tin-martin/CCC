/**
Create arrays for each food type that store the calories of each food. (item 1 will b stored at index 0, item 2 will be stored at index 1, etc.)
For each food group:
1. Ask the prompt question (Please enter a ____ choice.)
2. Add the calories to a counter using food group's array of calories using the index (input-1) 
Counter is printed
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
        int c = 0;
        int[] b = {461,431,420,0};
        int[] d = {130,150,118,0};
        int[] s = {100,57,70,0};
        int[] de = {167,266,75,0};
        
        System.out.println("Welcome to Chip's Fast Food Emporium");
     
        System.out.print("Please enter a burger choice: ");
        c += b[sc.nextInt()-1];
      
        System.out.print("Please enter a side order choice: ");
        c += s[sc.nextInt()-1];
        
        System.out.print("Please enter a drink choice: ");
        c += d[sc.nextInt()-1];
      
        System.out.print("Please enter a dessert choice: ");
        c += de[sc.nextInt()-1];
         
        System.out.println("Your total Calorie count is " + c + ".");
    }
}
