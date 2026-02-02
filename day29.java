import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] c=s.split(",");
        boolean fnd=false;
        int n1=0,p1=0,p2=0;
        for(int i=0;i<c.length;i++){
            if(c[i].equals("5")){
                fnd=true;
                p1=i;
            }
            else if(c[i].equals("8")){
                fnd=false;
                p2=i;
            }
            else if(fnd==false){
                n1+=Integer.valueOf(c[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(i>=p1 && i<=p2) sb.append(c[i]);
        }
        String v=sb.toString();
        int n2=Integer.valueOf(v);
        System.out.println(n1+n2);
    }
}
