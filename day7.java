import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int nm=i;
            int dif=n;
            System.out.print(nm+" ");
            for(int j=i;j<n;j++){
                nm=nm+dif;
                System.out.print(nm+" ");
                dif--;
            }
            System.out.println();
        }
    }
}
