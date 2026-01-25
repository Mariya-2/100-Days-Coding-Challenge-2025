import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int x=sc.nextInt();
        System.out.println(n.substring(0,x));
        System.out.println(n.substring(n.length()-x));
    }
}
