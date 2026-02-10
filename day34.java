import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] prts=s.split(",");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<prts.length;i++){
            String[] p=prts[i].split(":");
            char[] c=p[0].toCharArray();
            String n=p[1];
            int k=c.length;
            boolean found = false;
            for(int j=0;j<n.length();j++){
            if(n.charAt(j)-'0'==k){
                sb.append(c[k-1]);
                found = true;
                break;
            }
            }
            if(!found){
                int max=-1;
                for(int j=0;j<n.length();j++){
                    int d=n.charAt(j)-'0';
                    if(d<k && d>max) max=d;
                }
            if(max != -1)
               sb.append(c[max-1]);
            else{
                sb.append('X');
            }
            }
        }
        System.out.println(sb.toString());
    }
}
