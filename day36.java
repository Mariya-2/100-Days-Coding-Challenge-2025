import java.util.*;
public class Mian{
    public static boolean ispalindrome(long nxt){
        long org=nxt;
        long rev=0;
        while(nxt>0){
            long digi = nxt%10;
            rev=rev*10+digi;
            nxt=nxt/10;
        }
        return org==rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            long nxt=n+1;
            while(!ispalindrome(nxt)){
                nxt++;
            }
            System.out.println(nxt);
            t--;
        }
    }
}
