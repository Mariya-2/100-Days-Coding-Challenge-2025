import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String p=sc.nextLine();
            String s=sc.nextLine();
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<p.length();j++){
                char c1=p.charAt(j);
                for(int k=0;k<s.length();k++){
                    char c2=s.charAt(k);
                    if(c1==c2){
                        sb.append(c1);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
