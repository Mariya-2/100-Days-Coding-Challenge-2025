import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean up=true;
        for(int c=m-1;c>=0;c--){
            if(up){
                for(int r=n-1;r>=0;r--){
                    System.out.print(a[r][c]+" ");
                }
            }
            else{
                for(int r=0;r<n;r++){
                    System.out.print(a[r][c]+" ");
                }
            }
            up=!up;
        }
    }
}
