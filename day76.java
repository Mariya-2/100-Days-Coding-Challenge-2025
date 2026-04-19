import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            int k=sc.nextInt();
            int a[]=new int[k];
            for(int i=0;i<k;i++){
                a[i]=sc.nextInt();
            }
            int cnt=0;
            int c[]=new int[k];
            Arrays.fill(c,1);
            
            for(int i=1;i<k;i++){
                if(a[i]>a[i-1]){
                    c[i]=c[i-1]+1;
                }
            }
            for(int i=k-2;i>=0;i--){
                if(a[i]>a[i+1]){
                    c[i]=Math.max(c[i],c[i+1]+1);
                }
            }
            for(int i=0;i<k;i++){
                cnt+=c[i];
            }
            System.out.println(cnt);
        }
    }
}
