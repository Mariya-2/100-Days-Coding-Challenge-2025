import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            char d=sc.next().charAt(0);
            int fm=sc.nextInt();
            int bm=sc.nextInt();
            int t=sc.nextInt();
            int fbs=sc.nextInt();
            int bbs=sc.nextInt();
            
            int pos=0;
            int time=0;
            boolean frd=(d =='F');
            for(int i=0;i<10000;i++){
                int step=frd?fm:bm;
                for(int j=0;j<step;j++){
                    if(frd) pos++;
                    else pos--;
                    time+=t;
                    if(pos==fbs){
                        System.out.println(time+" F");
                        step=-1;
                        break;
                    }
                    if(pos==-bbs){
                        System.out.println(time+" B");
                        step=-1;
                        break;
                    }
                }
                if(step==-1) break;
                frd= !frd;
            }
            if(pos!=fbs && pos!=-bbs){
                System.out.println("Hurray");
            }
        }
    }
}
