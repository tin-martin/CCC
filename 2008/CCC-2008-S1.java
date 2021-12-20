/*
This question is pretty self explanatory. Just use a temporary array full of temperatures to identify the index of
the lowest temperature. Then, use that index to find the name of the city with the lowest temperature.

I learned something pretty important from this simple question: always use .equals() instead of == when comparing the primitive values of Integer objects.

On line 36, the use of == instead of .equals() resulted in a lot of errors. For objects like Integer, == compares memory addresses but 
.equals() compares primitive values. 
*/
import java.util.*;
import java.io.*;
public class test{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<Integer> temperatures = new ArrayList<Integer>();
        ArrayList<Integer> temp_temperatures = new ArrayList<Integer>();
      
        while(true){
            String city = sc.next();
            int temperature = sc.nextInt();
            cities.add(city);
            temperatures.add(temperature);
            temp_temperatures.add(temperature);
            if(city.equals("Waterloo")){
                break;
            }
        }
      
        Collections.sort(temp_temperatures);
      
        for(int i=0;i<temperatures.size();i++){ 
            if(temperatures.get(i).equals(temp_temperatures.get(0))){
                System.out.println(cities.get(i));
                break;
            }
        }
        
    }
}
