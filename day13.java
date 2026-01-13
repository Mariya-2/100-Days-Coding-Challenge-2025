import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        int n=sc.nextInt();
        int x=0, y=0, cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            String ins = sc.next();
            int value = Integer.parseInt(ins.substring(0,ins.length()-1));
            char dir = ins.charAt(ins.length()-1);
            int newX = x, newY=y;
            
            switch(dir){
                case 'R': newX += value; break;
                case 'L': newX -= value; break;
                case 'F': newY +=value; break;
                case 'B': newY -=value; break;
            }
            if(newX >=0 && newX <= L && newY >=0 && newY <=B){
                x=newX;
                y=newY;
            }else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
