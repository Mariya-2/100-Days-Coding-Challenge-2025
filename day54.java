import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String br=sc.nextLine();
        String gr=sc.nextLine();
        int r=0,m=0;
        for(int i=0;i<n;i++){
            if(gr.charAt(i)=='r')
              r++;
            else
              m++;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(br.charAt(i)=='r'){
                if(r>0)
                  r--;
                else{
                    ans=n-i;
                    break;
                }
            }
            else{
                if(m>0)
                  m--;
                else{
                    ans=n-i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
