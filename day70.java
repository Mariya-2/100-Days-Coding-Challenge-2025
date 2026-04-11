import java.util.*;
public class Main{
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b){
        if(a==0 || b==0) return 0;
        return Math.abs(a*b)/gcd(a,b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
            String[] s=sc.nextLine().split(" ");
            String[] c=sc.nextLine().split(" ");
            char ch[]=s[1].toCharArray();
            int x1=ch[0]-'0';
            int x2=ch[2]-'0';
            int an=lcm(x1,x2);
            int aa=Integer.valueOf(c[2]);
            System.out.println(s[0]+"'s question is:"+s[1]);
            int p1=0;
            int p2=0;
            String pl1=s[0];
            String pl2=c[1];
            if(an==aa){
                System.out.println("Correct Answer");
                System.out.println(pl1+": 10points");
                if(pl1.equals(pl1)){
                    p1+=10;
                }
                else{
                    p2+=10;
                }
            }
            else{
                System.out.println("Incorect Answer");
                System.out.println(pl1+": 0points");
            }
            System.out.println("Total points:");
            System.out.println(pl1+": "+p1+"points");
            System.out.println(pl2+": "+p2+"points"); 
    }
}
