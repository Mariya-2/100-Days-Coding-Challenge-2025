import java.util.*;
public class Mian{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> redo=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='^'){
                char cmd=s.charAt(++i);
                if(cmd=='z' && sb.length()>0){
                redo.push(sb.charAt(sb.length()-1));
                sb.deleteCharAt(sb.length()-1);
                }
                else if(cmd=='y' && !redo.isEmpty()){
                   sb.append(redo.pop());
                }
            }
            else{
                sb.append(s.charAt(i));
                redo.clear();
            }
        }
        System.out.print(sb.toString());
    }
}
