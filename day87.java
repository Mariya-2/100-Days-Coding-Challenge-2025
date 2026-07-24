import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            while(q-->0){
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int v=sc.nextInt();
                for(int i=l;i<=r;i++){
                    arr[i]=v&arr[i];
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
