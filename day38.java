import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] c=s.split(",");
        int n=c.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(c[i].trim());
        }
        List<Integer> best=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(a[i]);
            temp.add(a[i+1]);
            for(int j=i+2;j<n;j++){
                if(a[j]==temp.get(temp.size()-1)+temp.get(temp.size()-2))
                    temp.add(a[j]);
                else break;
            }
                
            if(temp.size()>best.size() ||(temp.size()==best.size() && temp.toString().compareTo(best.toString())<0)){
                best=temp;
            }
            for(int x:best)
               System.out.print(x+" ");
        }
    }
}
