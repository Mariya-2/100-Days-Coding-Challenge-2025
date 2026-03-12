import java.util.*;
public class Main{
    static boolean isPrime(int k){
        if(k<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
            int st=a[i][0];
            int en=a[i][1];
            int ans=0;
            for(int k=st;k<=en;k++){
                int cp=0;
                for(int m=1;m<=k;m++){
                    if(isPrime(m)){
                        cp++;
                    }
                }
                if(isPrime(cp)){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
