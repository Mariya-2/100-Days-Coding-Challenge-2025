import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int m=sc.nextInt(),n=sc.nextInt(),g[][] = new int[m][n],max=0;
            for(int i=0;i<m*n;i++){
                g[i/n][i%n]=sc.nextInt();
            }
            for(int j=1;j<n;j++){
                for(int i=0;i<m;i++){
                    int u=(i>0) ? g[i-1][j-1] : 0;
                    int d=(i<m-1) ? g[i+1][j-1] : 0;
                    g[i][j]+=Math.max(g[i][j],Math.max(u,d));
                }
            }
            for(int i=0;i<m;i++){
                max=Math.max(max,g[i][n-1]);
            }
            System.out.println(max);
        }
    }
}
