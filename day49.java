import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] w=new int[26];
        for(int i=0;i<26;i++){
            w[i]=sc.nextInt();
        }
        sc.nextLine();
        String str=sc.nextLine();
        String[] words=str.split(" ");
        long res=1;
        for(String word:words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                int index=Character.toLowerCase(c)-'a';
                sum+=w[index];
            }
            char f=word.charAt(0);
            int fi=Character.toLowerCase(f)-'a';
            if(w[fi]<0){
                sum+=fi+1;
            }
            char l=word.charAt(word.length()-1);
            int li=Character.toLowerCase(l)-'a';
            if(w[li]<0){
                sum+=li+1;
            }
            res*=sum;
        }
        System.out.println(res);
    }
}
