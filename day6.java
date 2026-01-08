import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(a[5]+" ");
        System.out.print(a[6/2]+" ");
        System.out.print(a[0]);
    }
}
