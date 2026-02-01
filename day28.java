import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean[] used=new boolean[10];
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int n=s.charAt(i)-'0';
                used[n]=true;
            }
        }
        int even=-1;
        for(int i=0;i<=9;i++){
            if(used[i] && i%2==0){
                even=i;
                break;
            }
        }
        if(even==-1){
            System.out.println(-1);
            return;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=9;i>=0;i--){
            if(used[i] && i!=even){
                sb.append(i);
            }
        }
        sb.append(even);
        System.out.println(sb.toString());
    }
}
