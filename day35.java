import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
               a[i][j]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                if(isval(a[i][j])&&isval(a[i][j+1])&&isval(a[i+1][j])&&isval(a[i+1][j+1])){
                    System.out.println(a[i][j]+" "+a[i][j+1]);
                    System.out.println(a[i+1][j]+" "+a[i+1][j+1]);
                }
            }
        }
    }
        static boolean isval(int num){
            int sum=0, temp=num;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            return num%sum==0;
        }
    
}
