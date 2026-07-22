import java.util.*;
public class Main{
    public static ArrayList<Integer> primefact(int n,int m){
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i<m){
                    factors.add(i);
                }
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1 && n<m){
           factors.add(n);
        }
        return factors;
    }
    static HashMap<Integer,Integer> bfs(int st,int m){
        HashMap<Integer,Integer> dist=new HashMap<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(st);
        dist.put(st,0);
        while(!q.isEmpty()){
            int cur=q.poll();
            for(int p: primefact(cur,m)){
                int nxt=cur/p;
                if(!dist.containsKey(nxt)){
                    dist.put(nxt,dist.get(cur)+1);
                    q.add(nxt);
                }
            }
        }
        return dist;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int m=sc.nextInt();
            HashMap<Integer, Integer> dx=bfs(x,m);
            HashMap<Integer,Integer> dy=bfs(y,m);
            int ans=Integer.MAX_VALUE;
            int flr=-1;
            for(int f:dx.keySet()){
                if(dy.containsKey(f)){
                    int time=dx.get(f)+dy.get(f);
                    if(time<ans){
                        ans=time;
                        flr=f;
                    }
                }
            }
            if(flr==-1){
                System.out.println(-1);
            }
            else{
                System.out.println(ans+" "+flr);
            }
        }
    }
}
