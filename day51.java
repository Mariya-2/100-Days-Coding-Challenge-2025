import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            int d=sc.nextInt();
            if(d<=1){
                System.out.println("You cannot generate Christmas tree");
            }
            else if(d>20){
                System.out.println("Tree is no more");
            }
            else{
                int p=d-1;
                int strt=2*p-1;
                for(int i=0;i<p;i++){
                    int str=strt-(2*i);
                    for(int j=1;j<=str;j+=2){
                        int space=(strt-j)/2;
                        for(int s=0;s<space;s++)
                            System.out.print(" ");
                        for(int k=0;k<j;k++)
                            System.out.print("*");
                        System.out.println();
                    }
                }
                int space=p;
                for(int i=0;i<space;i++)
                    System.out.print(" ");
                System.out.println("*");
                for(int i=0;i<space;i++)
                  System.out.print(" ");
                System.out.println("*");
            }
        }
    }
}
