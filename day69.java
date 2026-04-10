import java.util.*;
public class Main{
    public static boolean isgameno(int n){
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum += d*d;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
    public static boolean isprime(int i){
        if(i<2){
            return false;
        }
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(!sc.hasNextInt() || x<0){
            System.out.println("Invalid Input");
            return;
        }
        int y=sc.nextInt();
        int n=sc.nextInt();
        int cnt=0;
        for(int i=x;i<=y;i++){
            if(isprime(i) && isgameno(i)){
                cnt++;
                if(n==cnt){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("No number is present at this index");
    }
}
