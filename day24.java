import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    if(j+1<m && a[i][j+1]==1) t++;
                    if(i+1<n && a[i+1][j]==1)t++;
                    if(i+1<n && j+1<m && a[i+1][j+1]==1) t++;
                    if(i+1<n && j-1>=0 && a[i+1][j-1]==1)t++;
                }
            }
        }
        System.out.println(t);
    }
}
