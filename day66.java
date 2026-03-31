import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            int f=sc.nextInt();
            int b=sc.nextInt();
            int t=sc.nextInt();
            int d=sc.nextInt();
            
            int pos=0;
            int time=0;
            
            while(true){
                if(pos-b<=-d){
                    time+=(pos+d)*t;
                    System.out.println(time);
                    break;
                }
                pos-=b;
                time+=b*t;
                pos+=f;
                time+=f*t;
            }
        }
        sc.close();
    }
}
