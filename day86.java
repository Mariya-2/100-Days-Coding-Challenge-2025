import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           int r1=sc.nextInt();
           int r2=sc.nextInt();
           int n=sc.nextInt();
           sc.nextLine();
           String s=sc.nextLine();
           boolean[] prime =new boolean[n+1];
           Arrays.fill(prime,true);
           if(n>=0) prime[0]=false;
           if(n>=1) prime[1]=false;
           for(int i=2;i*i<=n;i++)
             if(prime[i])
                for(int j=i*i;j<=n;j+=i)
                   prime[j]=false;
            int[] cnt=new int[n+1];
            int[] d=new int[n+1];
            Arrays.fill(d,-1);
            for(int i=1;i<=n;i++)
              cnt[i]=cnt[i-1]+(prime[i]?1:0);
            Queue<Integer> q=new LinkedList<>();
            if(s.charAt(0)=='#'){
                q.add(1);
                d[1]=0;
            }
            while(!q.isEmpty()){
                int x=q.poll();
                int[] a={x+1 ,x+2, cnt[x]*r2>=x*r1 ? x+cnt[x] : -1};
                for(int y:a)
                  if(y>0 && y<=n && d[y]==-1 && s.charAt(y-1)=='#'){
                      d[y]=d[x]+1;
                      q.add(y);
                  }
            }
           System.out.println(d[n]==-1 ? "Not possible" : d[n]);
        }
    }
}
