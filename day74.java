import java.util.*;
public class Main{
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<0){
                System.out.println("Invalid Input");
                return;
            }
            int f=1;
            for(int i=1;i<=n;i++){
                f*=i;
            }
            for(int p=2;p<=n;p++){
                if(isprime(p)){
                    int cnt=0;
                    int t=n;
                    while(t>0){
                        t=t/p;
                        cnt+=t;
                    }
                    System.out.print(cnt+" ");
                }
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
