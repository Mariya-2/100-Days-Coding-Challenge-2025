import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int i=sc.nextInt();
        
        int total=0;
        int str=h;
        int prev=0;
        for(int r=1;r<=n;r++){
           int strs=r;
            int has=r-1;
            total+=strs*str+has*prev;
            prev=str;
            str+=i;
        }
        System.out.println(total);
    }
}
