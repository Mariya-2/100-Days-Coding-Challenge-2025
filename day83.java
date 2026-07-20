import java.util.*;
public class Main{
    public static boolean isprime(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isstrong(int x){
        if(!isprime(x)) return false;
        
        int prev=x-1,next=x+1;
        while(!isprime(prev)) prev--;
        while(!isprime(next)) next++;
        
        return 2*x > prev + next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            int cnt=0;
            int st=sc.nextInt();
            int en=sc.nextInt();
            for(int i=st;i<=en;i++){
                if(isstrong(i)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
