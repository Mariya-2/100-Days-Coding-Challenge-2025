import java.util.*;
public class Main{
    public static boolean isprime(Long x){
        if(x<2){
            return false;
        }
        for(long i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void gen(List<Long> l1, boolean[] used, String curr, Set<Long> set){
        if(curr.length()>6) return;
        
        for(int i=0;i<l1.size();i++){
            if(used[i]) continue;
            
            used[i]=true;
            gen(l1, used, curr + l1.get(i), set);
            used[i]=false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        List<Long> l1=new ArrayList<>();
        for(long i=n1;i<=n2;i++){
            if(isprime(i)){
                l1.add(i);
            }
        }
        Set<Long> set=new HashSet<>();
        gen(l1,new boolean[l1.size()], "",set);
        // System.out.println(set);
        List<Long> l2=new ArrayList<>();
        for(long x: set){
            if(isprime(x)){
                l2.add(x);
            }
        }
        Collections.sort(l2);
        
        Long a=l2.get(0);
        Long b=l2.get(l2.size()-1);
        int cnt=l2.size();
        
        long fst=a;
        long snd=b;
        if(cnt==1){
            System.out.println(a);
        }
        else{
        for(int i=2;i<cnt;i++){
            long nxt=fst+snd;
            fst=snd;
            snd=nxt;
        }
        System.out.println(snd);
        }
    }
}
