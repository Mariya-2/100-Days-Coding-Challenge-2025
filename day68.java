import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int n=sc.nextInt();
        int z[]=new int[n];
        for(int i=0;i<n;i++){
            if(!sc.hasNextInt()){
                System.out.println("Invalid Input");
                return;
            }
            z[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int h=(z[i]%2)+(z[i]/2);
            b=b-h;
            if(b<z[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
