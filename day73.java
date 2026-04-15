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
    public static boolean cons(int n){
        int sum=0;
        for(int i=2;i<n;i++){
            if(isprime(i)){
                sum+=i;
            }
            if(sum==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            int cnt=0;
            for(int j=2;j<c;j++){
                if(isprime(j)){
                    if(cons(j)){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
