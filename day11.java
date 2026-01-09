import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        if(s.charAt(0)=='0'){
            System.out.println(0);
            return;
        }
        int a=1,b=1;
        for(int i=1;i<n;i++){
            int c=0;
            if(s.charAt(i)!='0') c=b;
            
            int num=(s.charAt(i-1)-'0')*10+(s.charAt(i)-'0');
            if(num >=10 && num <=26) c +=a;
            
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}
