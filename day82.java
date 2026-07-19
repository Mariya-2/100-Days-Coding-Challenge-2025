import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int cmin=Integer.MAX_VALUE;
            int cmax=-1;
            int tmin=Integer.MAX_VALUE;
            int tmax=-1;
            int ic1=-1,ic2=-1,it1=-1,it2=-1; 
            for(int i=1;i<n-1;i++){
                // int max=arr[i]-Math.min(arr[i-1],arr[i+1]);
                // int min=arr[i]=Math.max(arr[i-1],arr[i+1]);
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    int x=Math.min(arr[i-1],arr[i+1])-arr[i]; 
                    if(x>=cmax){
                        cmax=x;
                        ic2=i;
                    }
                    if(x<cmin){
                        cmin=x;
                        ic1=i;
                    }
                }
                if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                    int x=Math.max(arr[i-1],arr[i+1])-arr[i]; 
                   if(x>=tmax){
                       tmax=x;
                       it2=i;
                   }
                   if(x<cmin){
                       cmin=x;
                       it1=i;
                   }
                }
            }
            if(ic1==-1 || it1==-1){
                System.out.println(-1);
            }
            else{
                System.out.println(Math.max(Math.abs(ic2-ic1),Math.abs(it2-it1)));
            }
        }
    }
}
