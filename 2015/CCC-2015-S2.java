
import java.util.*;
import java.lang.*;
/**
public class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
        
    }
}

public class LinkedIntList{
    ListNode front;
    public LinkedIntList{
        this.front = null;
    }
    public void add(int data){
        ListNode n = this.front;
        if(n == null){
            this.front = new ListNode(data);
            return;
        }
        while(true){
            if(n.next == null){
                n.next = new ListNode(data);
                return;
            }else{
                n = n.next;
            }
        }
    }   
    
    public void printLinkedIntList(){
        ListNode n = front;
        while(n != null){
            System.out.print(n+" ");
            n = n.next;
        }
    }
}*/

public class Main {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for(int t=0;t<T;t++){
            solve(sc);
        }
        
    }
    
    static void solve(Scanner sc){
        int J = sc.nextInt();
        int A = sc.nextInt();
        String[] jerseys = new String[J];
        for(int j=0;j<J;j++){
            jerseys[j] = sc.next();
        }
        
        int output = 0;
        
        for(int a=0;a<A;a++){
            String size = sc.next();
            int jNum = sc.nextInt()-1;    
            if((jerseys[jNum].equals("L") || jerseys[jNum].equals("M") || jerseys[jNum].equals("S") ) && size.equals("S")){
                jerseys[jNum] = "T";
                output ++;  
            }else if((jerseys[jNum].equals("L") || jerseys[jNum].equals("M")) && size.equals("M")){
                jerseys[jNum] = "T";
                output ++; 
            }else if(jerseys[jNum].equals("L") && size.equals("L")){
                jerseys[jNum] = "T";
                output ++; 
            }
        }
        System.out.println(output);
        
        
        
    }
    
    
    
}  
