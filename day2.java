import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int cnt=0;
        for(int i:a){
            cnt +=i/k;
            if(i%k!=0){
                cnt +=1;
            }
        }
        System.out.println(cnt);
    }
}
