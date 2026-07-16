import java.util.*;
public class Main{
    static boolean check(int[] a,int m,long x){
        int cnt=1;
        long sum=0;
        
        for(int n:a){
            if(sum+n>x){
                cnt++;
                sum=n;
            }
            else{
                sum+=n;
            }
        }
        return cnt<=m;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            long l=0,r=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                l=Math.max(l,a[i]);
                r+=a[i];
            }
            while(l<r){
                long mid=(l+r)/2;
                if(check(a,m,mid))
                   r=mid;
                else
                   l=mid+1;
            }
            System.out.println(l);
        }
    }
}
