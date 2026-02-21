import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length-1;i++){
            if(c[i]==' '){
                sb.append(c[i]);
            }
            else if(Character.isDigit(c[i])){
                sb.append(c[i]);
            }
            else if(Character.isLetter(c[i]) && Character.isLetter(c[i+1])){
                int val1=c[i]-'a'+1;
                int val2=c[i+1]-'a'+1;
                int n=Math.abs(val1-val2);
                char let=(char)('a'+n-1);
                sb.append(c[i]);
                if(n!=0)
                   sb.append(let);
                else if(n==0){
                    sb.append(0);
                }
            }
            else if(Character.isLetter(c[i]) && (c[i+1]==' ' || Character.isDigit(c[i+1]))){
                sb.append(c[i]);
            }
        }
        // if(Character.isDigit(c[c.length-1])){
            sb.append(c[c.length-1]);
        // }
        System.out.print(sb.toString());
    }
}
