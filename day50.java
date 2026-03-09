import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] c=s.split(" ");
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            char[] ch=c[i].toCharArray();
            int j=c[i].length()-1;
            for(int k=0;k<ch.length;k++){
                if(k<j){
                    char temp=ch[k];
                    ch[k]=ch[j];
                    ch[j]=temp;
                }
                j--;
            }
            sb.append(ch);
            sb.append(" ");
        }
        if(n==0)
           System.out.println(sb.toString());
        else{
            String v=sb.toString();
            String[] sbl=v.split(" ");
            for(int i=0;i<sbl.length;i++){
                char[] cc=sbl[i].toCharArray();
                 cc[0]=Character.toUpperCase(cc[0]);
                 if(cc[0]!=','){
                  cc[cc.length-1]=Character.toLowerCase(cc[cc.length-1]);
                 }
                System.out.print(cc);
                System.out.print(" ");
            }
        }
    }
}
