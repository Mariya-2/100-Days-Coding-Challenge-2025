import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int v=a[i];
            int c=0;
            while(v>0){
                if(c%2==0){
                    if(v>=4){
                        v-=4;
                    }
                    else{
                        v-=1;
                    }
                }
                else{
                   if(v>=4){
                       v-=4;
                   } 
                   else{
                       v-=1;
                   }
                }
                c++;
            }
            if(c%2==0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
