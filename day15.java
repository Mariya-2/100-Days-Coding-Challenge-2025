import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            List<Character> lst=new ArrayList<>();
            boolean inval=false;
            for(int j=0;j<s[i].length();j++){
                if(s[i].charAt(j)=='^'){
                    if(lst.size()>0)
                       lst.remove(lst.size()-1);
                }
                else{
                    lst.add(s[i].charAt(j));
                }
            }
            if(lst.size()==0) System.out.println("-1");
            else{
                for(char c:lst){
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
}
