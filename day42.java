import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        int a3[]=new int[n];
        for(int i=0;i<n;i++){
           a1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a3[i]=sc.nextInt();
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=a1[i]+a2[i]+a3[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int index=(a[i]-1)%n;
            if(i%3==0)
               sum+=a1[index];
            else if(i%3==1)
               sum+=a2[index];
            else
               sum+=a3[index];
        }
        System.out.println(sum);
    }
}
