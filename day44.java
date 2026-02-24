import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] c=s.split(":");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(c[i].charAt(0)==c[i].charAt(1)){
                sb.append(c[i].charAt(0));
            }
            else{
                int n1=c[i].charAt(0)-'a'+1;
                int n2=c[i].charAt(1)-'a'+1;
                int n=Math.abs(n1-n2);
                char ch=(char)('a'+n-1);
                sb.append(ch);
            }
        }
        System.out.println(sb.toString().toUpperCase());
    }
}
