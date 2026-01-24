import java.util.*;
public class Mian{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ft=0;
        int lt=0;
        int m=0;
        for(int i=0;i<n;i++){
            if(i==0){
                ft=0;
                lt=a[i+1];
            }
            else if(i==n-1){
                lt=0;
                ft=a[i-1];
            }
            else{
                ft=a[i-1];
                lt=a[i+1];
            }
             m =a[i]+Math.abs(ft-lt);
            System.out.print(m+" ");
        }
    }
}
