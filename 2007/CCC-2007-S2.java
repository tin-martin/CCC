/**

This solution functions under two principles: (stupidly simple principles but I initially struggled with :( so I though to include them)
1. a box with different permutations of l,w,h is the same box
Thus,
2. if the respective dimensions of two boxes are both sorted from least to greatest (or vice versa) and compared 
one another, this can easily tell us if one box can be oriented to fit within another.

The solution is as follows:
1. For all default boxes and unpackaged boxes, sort their respective dimensions from least to greatest.
2. For all default boxes, sort from least to greatest volume.
3. Iterate through all unpackaged boxes:
  a. Iterate through all default boxes, from least to greatest volume, until a box is found where the unpackaged box fits within it.
     This can be done by comparing the lowest values of both boxes, the middle values of both boxes, and the largest values of both boxes. 
     If all of the upackagd box's dimensions fall under or equal to the default box's dimensions, the unpackaged box can be said to fit into the
     default box
     
  b. Print the volume of the default box that fits. Continue to the next unpackaged box. If there is no box that fits, print "Item does not fit."


**/
import java.util.*;
import java.io.*;
public class test{
    public static void main(String[] args) throws Exception{
        //For all default boxes and unpackaged boxes, sort their respective dimensions from least to greatest
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<int[]> defBoxes = new ArrayList<int[]>();
        for(int n=0;n<N;n++){
            int[] box = {sc.nextInt(),sc.nextInt(), sc.nextInt()};
            Arrays.sort(box);
            defBoxes.add(box);
        }
        int M = sc.nextInt();
        ArrayList<int[]> uBoxes = new ArrayList<int[]>();
        for(int m=0;m<M;m++){
            int[] box = {sc.nextInt(),sc.nextInt(), sc.nextInt()};
            Arrays.sort(box);
            uBoxes.add(box);
        }
        //For all default boxes, sort from least to greatest volume
        Collections.sort(defBoxes, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                int volA = a[0]*a[1]*a[2];
                int volB = b[0]*b[1]*b[2];
                if(volA < volB) return -1;
                return 1;
            };
        });
        a: for(int[] box : uBoxes){
            for(int[] defBox : defBoxes){
                // checks if the unpackaged box fits
                if(box[0] <= defBox[0] && box[1] <= defBox[1] && box[2] <= defBox[2]){
                    int product = 1;
                    for(int x : defBox){
                        product *= x;
                    }
                    System.out.println(product);
                    continue a;
                }
            }
            //if the unpackaged box doesn't fit any default boxes
            System.out.println("Item does not fit.");
        }
    }
}
