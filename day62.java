import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
          int n1=sc.nextInt();
          int n2=sc.nextInt();
          int n3=sc.nextInt();
          if(n1<=0 || n2<=0 || n1>=n2){
              System.out.println("Invalid Input");
              return;
          }
          List<Integer> fil=new ArrayList<>();
        for(int n=1; ;n++){
            int mat=n * (2 * n -1);
            if(mat>n2) break;
            if(mat>=n1){
                fil.add(mat);
            }
        }
          if(fil.size()>=n3 && n3>0){
              System.out.println(fil.get(n3-1));
          }
          else{
              System.out.println("No number is present at this index");
          }
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
}
