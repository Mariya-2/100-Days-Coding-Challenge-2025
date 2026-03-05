import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.nextLine();
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)<s.charAt(i+1))
                dec=false;
            else if(s.charAt(i)>s.charAt(i+1))
                inc=false;
        }
        if(inc){
            System.out.print("Increasing:");
        }
        else if(dec){
            System.out.print("Decreasing:");
        }
        else{
            return;
        }
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c.charAt(i))
               l++;
        }
        System.out.print(l);
    }
}
