import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int spot[]=new int[m+1];
        spot[0]=1;
        for(int i=1;i<=m;i++){
            spot[i]=sc.nextInt();
        }
        int visit[]=new int[n+1];
        for(int i=0;i<m;i++){
            int f=spot[i];
            int l=spot[i+1];
            int curr=f;
            while(true){
                visit[curr]++;
                if(curr==l)
                   break;
                curr++;
                if(curr>n)
                   curr=1;
            }
        }
        int ans=1;
        for(int i=2;i<=n;i++){
            if(visit[i]>visit[ans]){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
