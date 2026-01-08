import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int m=s.length()/2;
        String t=s.substring(m)+s.substring(0,m);
        for(int i=0;i<n;i++){
           int ch=i+1;
           for(int k=0;k<n-ch;k++){
               System.out.print("*");
           }
           System.out.print(t.substring(0,ch));
           System.out.println();
        }
    }
}
