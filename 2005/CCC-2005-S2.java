import java.util.*;
public class test{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        int C = sc.nextInt();
        int R = sc.nextInt();    
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x==0 && y==0) break;
            X.add(x);
            Y.add(y);
        }
        int X_coord = 0;
        int Y_coord = 0;
        for(int i=0; i<X.size();i++){
            int X_placeholder = X_coord;
            int Y_placeholder = Y_coord;
            
            X_coord += X.get(i);
            Y_coord += Y.get(i);
            if (X_coord < 0) X_coord = 0;
            if(X_coord > C) X_coord = C;
            if(Y_coord < 0) Y_coord = 0;
            if(Y_coord > R) Y_coord = R;
            System.out.println(X_coord + " " + Y_coord);
        }
    }
}
