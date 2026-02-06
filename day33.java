import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        int k=sc.nextInt();
        String[] s=c.split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<=a.length-k;i++){
            int cnt=0;
            for(int j=i;j<i+k;j++){
                boolean isDist=true;
                for(int m=i;m<j;m++){
                    if(a[j]==a[m]){
                        isDist=false;
                        break;
                    }
                }
                if(isDist) cnt++;
            }
            System.out.print(cnt+" ");
        }
    }
}
