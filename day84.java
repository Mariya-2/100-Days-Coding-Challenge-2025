import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            sc.nextLine();
            String s=sc.nextLine();
            String c=sc.nextLine();
            long k=sc.nextLong();
            int cnt[]=new int[26];
            boolean pos=true;
            for(int i=0;i<s.length();i++){
                int sft=(c.charAt(i)-s.charAt(i)+26)%26;
                if(sft==0)
                   continue;
                long need = sft+26L*cnt[sft];
                if(need>k){
                    pos=false;
                    break;
                }
                cnt[sft]++;
            }
            System.out.println(pos ? "Yes" : "No");
        }
    }
}
