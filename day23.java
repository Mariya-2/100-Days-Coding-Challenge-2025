import java.util.*;
public class Mian{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=n-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i+1]>=a[i]){
                s=i;
            }
            else{
                break;
            }
        }
        System.out.println(a[s]);
    }
}
