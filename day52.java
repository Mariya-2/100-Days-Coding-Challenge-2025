import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=1;k<=n;k++){
            System.out.println("Case #"+k);
            int c1=sc.nextInt();
            int mm=c1;
            int num=0;
        for(int i=0;i<c1;i++){
            int m=i*2;
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            for(int j=0;j<mm;j++){
                num+=10;
                System.out.print(num);
            }
            int s=num+10;
            for(int j=0;j<mm;j++){
                System.out.print(s+j);
            }
            mm--;
            
            System.out.println();
        }
        }
    }
}
