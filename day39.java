import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        Stack<Integer> pos=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
                pos.push(i+1);
            }
            else{
                if(stack.isEmpty()){
                   System.out.println(i+1);
                   return;
                }
               char top=stack.peek();
               if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){
                  stack.pop();
                  pos.pop();
                }
                else{
                   System.out.println(i+1);
                   return ;
                }
            }
        }
        if(stack.isEmpty())
            System.out.println(0);
        else
            System.out.println(s.length()+1);
    }
}
