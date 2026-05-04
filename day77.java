import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int cnt=0;
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]==a[j]){
                    a[j]=0;
                }
            }
        }
        for(int i=0;i<10;i++){
            for(int j=1+i;j<10;j++){
                int mn=a[i]+a[j];
                if(mn%m == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
