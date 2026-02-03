import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] p=s.split(":");
        char c[]=p[0].toCharArray();
        int n1=Integer.valueOf(p[1]);
        int n2=Integer.valueOf(p[2]);
        int n3=Integer.valueOf(p[3]);
        for(int j=0;j<n1;j++){
            char temp=c[c.length-1];
            for(int i=c.length-1;i>0;i--){
               c[i]=c[i-1];
            }
            c[0]=temp;
        }
        for(int j=0;j<n2;j++){
            char temp=c[0];
            for(int i=0;i<c.length-1;i++){
                c[i]=c[i+1];
            }
            c[c.length-1]=temp;
        }
        for(int i=0;i<c.length;i++){
            if(i%n3!=0){
                System.out.print(c[i]);
            }
        }
    }
}
