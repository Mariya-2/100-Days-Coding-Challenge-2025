import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=0;
        for(int j=0;j<=n-k;j++){
            max=a[j];
            
           for(int i=j;i<j+k;i++){
              if(a[i]>max){
                max=a[i];
              }
            }
            System.out.print(max+" ");
        }
        
    }
}
