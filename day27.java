import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n+1;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        TreeSet<Integer> fn=new TreeSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j+2<m){
                if(a[i][j]==a[i][j+1] && a[i][j]==a[i][j+2]){
                    fn.add(a[i][j]);
                }
                }
                if(i+2<n){
                if(a[i][j]==a[i+1][j] && a[i][j]==a[i+2][j]){
                    fn.add(a[i][j]);
                }
                }
                if(i+2<n && j+2<m){
                if(a[i][j]==a[i+1][j+1] && a[i][j]==a[i+2][j+2]){
                    fn.add(a[i][j]);
                }
                }
                if(i+2<n && j-2>=0){
                    if(a[i][j]==a[i+1][j-1] && a[i+2][j-2]==a[i][j]){
                        fn.add(a[i][j]);
                    }
                }
            }
        }
        if(!fn.isEmpty())
           System.out.println(fn.first());
    }
}
