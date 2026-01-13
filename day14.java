import java.util.*;
public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
      String s2=sc.next();
      int j=0;
      for(int i=0;i<s1.length() && j<s2.length();i++){
              if(s1.charAt(i)==s2.charAt(j)){
                  j++;
              }
      }
      if(j==s2.length())
          System.out.println("YES");
      else
        System.out.println("NO");
    }
}
