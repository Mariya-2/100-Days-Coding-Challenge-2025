import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tot=n*(n+1)/2;
        int a[]=new int[tot];
        int diff=22;
        a[0]=6;
        for(int i=1;i<tot;i++){
            a[i]=a[i-1]+diff;
            diff+=16;
        }
        int index=0;
        for(int i=1;i<=n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print("   ");
            }
            for(int j=0;j<i;j++){
                System.out.printf("%05d",a[index++]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
