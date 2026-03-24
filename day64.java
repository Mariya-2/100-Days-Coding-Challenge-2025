import java.util.*;
public class Main{
    static int cntprimefact(int n){
        int cnt=0;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                cnt++;
                n/=i;
            }
        }
        if(n>1) cnt++;
        
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int xor=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int grundy;
            if(x==1) grundy=0;
            else grundy=cntprimefact(x);
            
            xor^=grundy;
        }
        if(xor==0){
            System.out.println("JASBIR");
        }
        else{
            System.out.println("AMAN");
        }
    }
}
