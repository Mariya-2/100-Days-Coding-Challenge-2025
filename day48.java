import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int maxcnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    cnt++;
                }
            }
            if(maxcnt<cnt){
                maxcnt=cnt;
                max=a[i];
            }
        }
        System.out.print(max);
        int max2=a[0];
        maxcnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j] && a[i]!=max){
                    cnt++;
                }
            }
            if(maxcnt<cnt){
                maxcnt=cnt;
                max2=a[i];
            }
        }
        System.out.print(max2);
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]!=a[i+1])
               System.out.print(a[i]);
               return;
        }
    }
}
