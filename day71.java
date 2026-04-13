import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int f=sc.nextInt();
            int b=sc.nextInt();
            int t=sc.nextInt();
            int fd=sc.nextInt();
            int bd=sc.nextInt();
            
            int pos=0;
            int time=0;
            HashSet<Integer> vis=new HashSet<>();
            while(true){
                if(vis.contains(pos)){
                    System.out.println("No Ditch");
                    break;
                }
                vis.add(pos);
                if(pos+f>=fd){
                    int dist=fd-pos;
                    time+=dist*t;
                   System.out.println(time+" F");
                   break;
                }
                else{
                    pos+=f;
                    time+=f*t;
                }
                if(pos-b<=-bd){
                    int dist=pos+bd;
                    time+=dist*t;
                   System.out.println(time+" B");
                   break;
                }
                else{
                    pos-=b;
                    time+=b*t;
                }
            }
        }
    }
}
