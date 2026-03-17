import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            boolean status=true;
            for(int j=0;j<s.length();j++){
                int cnt=1;
                for(int k=i+1;k<s.length();k++){
                    if(s.charAt(j)==s.charAt(k)){
                        cnt++;
                    }
                }
                int cn=s.charAt(j)+'a'-1;
                if(cn!=cnt){
                    status=false;
                }
            }
            if(status){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
