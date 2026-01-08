import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int flag=0;
        for(int i=1;i<n.length();i++){
            int prev=n.charAt(i-1)-'0';
            int curr=n.charAt(i)-'0';
            if(Math.abs(curr-prev)!=1){
                flag =1;
                break;
            }
        }
        if(flag==1) System.out.print("no");
        else if(flag==0) System.out.print("yes");
    }
}
