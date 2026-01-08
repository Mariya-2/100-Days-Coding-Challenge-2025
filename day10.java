import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                cnt++;
                res.add(1);
                if(cnt==k){
                    res.add(0);
                    cnt=0;
                }
            }
            else{
                res.add(0);
                cnt=0;
            }
        }
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
