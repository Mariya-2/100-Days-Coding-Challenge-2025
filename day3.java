import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res="";
        while(n>0){
            n--;
            char c=(char)('A'+(n%26));
            res=c+res;
            n=n/26;
        }
        System.out.print(res);
    }
}
