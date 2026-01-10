import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int j[]=new int[m];
        for(int k=0;k<m;k++){
            j[k]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            for(int k=0;k<n;k++){
                if(b[k]%j[i]==0 && b[k]!=0){
                    b[k]=0;
                }
            }
        }
        boolean anyleft = false;
        for(int x:b){
            if(x!=0){
                System.out.print(x+" ");
                anyleft=true;
            }
        }
        if(!anyleft) System.out.print(-1);
    }
}
