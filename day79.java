import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1=sc.nextLine();
            String sent[]=s1.split(" ");
            int n=sc.nextInt();
            sc.nextLine();
            String s2=sc.nextLine();
            String seed[]=s2.split(" ");
            if(s1.contains(s2)){
                System.out.println(s2);
            }
            else{
                int f=0;
                int l=sent.length-1;
                for(int i=0;i<sent.length;i++){
                    boolean fnd[]=new boolean[n];
                    int cnt=0;
                    for(int j=i;j<sent.length;j++){
                        for(int k=0;k<n;k++){
                            if(!fnd[k] && seed[k].equals(sent[j])){
                                fnd[k]=true;
                                cnt++;
                            }
                        }
                        if(cnt==n){
                            if(j-i < l-f){
                                f=i;
                                l=j;
                            }
                            break;
                        }
                    }
                }
                StringBuilder sb=new StringBuilder();
                for(int i=f;i<=l;i++){
                    sb.append(sent[i]);
                    if(i<l) sb.append(" ");
                    if(seed[n-1].equals(sent[i])){
                        System.out.print(sb.toString());
                        return;
                    }
                }
            }
        }
    }
}
