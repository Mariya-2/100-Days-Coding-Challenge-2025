import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int  cnt=0;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        if(a[i]+a[j]+a[k]+a[l]>=100) cnt++; 
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
