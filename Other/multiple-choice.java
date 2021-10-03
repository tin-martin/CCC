import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine().replaceAll(" ","");
        String r = input.substring(0,n);
        String a = input.substring(n);
        int correct = 0;
        for(int i=0;i<n;i++){
            if (r.charAt(i) == a.charAt(i)) correct++;
        }
        System.out.println(correct);
        
    }
}
