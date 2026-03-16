import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            char c[]=s.toCharArray();
            char v=c[c.length-1];
            for(int l=c.length-1;l>0;l--){
                c[l]=c[l-1];
            }
            c[0]=v;
            int right=c.length-1;
            int left=0;
            boolean fnd=true;
            while(left<right){
                if(c[left++]!=c[right--]){
                    fnd=false;
                }
            }
            if(fnd){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
