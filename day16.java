import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<String> lst=new ArrayList<>();
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.trim().isEmpty()) break;
            
            lst.add(s);
        }
        StringBuilder res = new StringBuilder();
        for(String s:lst){
            String[] words =s.trim().split("\\s{2,}");
            for(int i=0;i<words.length;i++){
                String[] let=words[i].trim().split("\\s+");
                for(String l:let){
                    int len=l.length();
                    char ch=(char)('a'+len-1);
                    res.append(ch);
                }
                if(i<words.length-1)
                   res.append(" ");
            }
            res.append(" ");
        }
        System.out.print(res.toString().trim());
    }
}
