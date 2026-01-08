import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i<10){
                cnt +=1;
            }
            else{
                cnt +=2;
            }
        }
        System.out.print(cnt);
    }
}
