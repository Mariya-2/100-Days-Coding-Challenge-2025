import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextLine()) return;
        String s=sc.nextLine();
        String[] c=s.split(" ");
        long sum=0;
        int st=Integer.parseInt(c[0]);
        int en=Integer.parseInt(c[1]);
        String op=c[2];
        int m=Integer.parseInt(c[3]);
        for(int i=st;i<=en;i++){
            if(op.equals("*")){
                int v = i * m;
                sum += v;
            }
            else if(op.equals("%")){
                int v=i % m;
                sum+=v;
            }
            else if(op.equals("^")){
                sum+=(long)Math.pow(i,m);
            }
            else if(op.equals("/"))
              if(m!=0)
                sum+=(i/m);
            else if(op.equals("+"))
               sum+=(i+m);
            else if(op.equals("-")){
                sum+=(i-m);
            }
        }
        System.out.println(sum);
    }
}
