import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=s.length();i>=2;i--){
            if(i%2!=0) continue;
            
            for(int j=0;j+i<=s.length();j++){
                int mid=j+i/2;
                int sum1=0,sum2=0;
                for(int k=j;k<mid;k++)
                   sum1 +=s.charAt(k)-'0';
                for(int k=mid;k<j+i;k++)
                   sum2+=s.charAt(k)-'0';
                if(sum1==sum2){
                    ans=s.substring(j,j+i);
                    System.out.print(ans);
                    return;
                }
            }
        }
        System.out.print("-1");
    }
}
