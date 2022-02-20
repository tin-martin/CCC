
import java.util.*;
import java.lang.*;
public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for(int t=0;t<T;t++){
            solve(sc);
        }
    }
    
    static void solve(Scanner sc){
        String str = sc.nextLine();
        int A = 0, B = 0;
        while(!str.equals("7")){
            String[] arr = str.split(" ");
            
            if(arr[0].equals("1")){
                if(arr[1].equals("A")){
                    A = Integer.parseInt(arr[2]);
                }else if(arr[1].equals("B")){
                    B = Integer.parseInt(arr[2]);
                }
            }else if(arr[0].equals("2")){
                if(arr[1].equals("A")){
                    System.out.println(A);
                }else{
                    System.out.println(B);
                }
            }else if(arr[0].equals("3")){
                if(arr[1].equals("A")){
                    if(arr[2].equals("A")){
                        A = A+A;
                    }else if(arr[2].equals("B")){
                        A = A+B;
                    }
                }else if(arr[1].equals("B")){
                    if(arr[2].equals("A")){
                        B = B+A;
                    }else if(arr[2].equals("B")){
                        B = B+B;
                    }
                }
import java.io.*;



            }else if(arr[0].equals("4")){
                if(arr[1].equals("A")){
                    if(arr[2].equals("A")){
                        A = A*A;
                    }else if(arr[2].equals("B")){
                        A = A*B;
                    }
                }else if(arr[1].equals("B")){
                    if(arr[2].equals("A")){
                        B = B*A;
                    }else if(arr[2].equals("B")){
                        B = B*B;
                    }
                }
            }else if(arr[0].equals("5")){
                if(arr[1].equals("A")){
                    if(arr[2].equals("A")){
                        A = A-A;
                    }else if(arr[2].equals("B")){
                        A = A-B;
                    }
                }else if(arr[1].equals("B")){
                    if(arr[2].equals("A")){
                        B = B-A;
                    }else if(arr[2].equals("B")){
                        B = B-B;
                    }
                }
            }else if(arr[0].equals("6")){
                if(arr[1].equals("A")){
                    if(arr[2].equals("A")){
                        A = A/A;
                    }else if(arr[2].equals("B")){
                        A = A/B;
                    }
                }else if(arr[1].equals("B")){
                    if(arr[2].equals("A")){
                        B = B/A;
                    }else if(arr[2].equals("B")){
                        B = B/B;
                    }
                }
            }
            str = sc.nextLine();
            
        }
       
        
        
    }
}  
