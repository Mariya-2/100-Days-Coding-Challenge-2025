import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Integer> digits=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(char c:s.toCharArray()){
            digits.add(c-'0');
        }
        for(int i=0;i<=8;i++){
                if(digits.contains(i) && digits.contains(i+1)){
                    int prod=i*(i+1);
                    
                String prodstr=String.valueOf(prod);
                if(s.indexOf(prodstr)!=-1){
                    result.add(prod);
                }
                }
        }
        if(result.isEmpty()){
            System.out.println("-1");
        }
        else{
            ArrayList<Integer> list=new ArrayList<>(result);
            Collections.sort(list);
            for(int num:list)
               System.out.print(num+" ");
        }
    }
}
