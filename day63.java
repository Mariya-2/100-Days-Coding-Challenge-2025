import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double f=sc.nextFloat();
        double an=(n/360.0)*f;
        int hr=(int) an;
        double min=(an-hr)*60;
        double hrang =(30*hr)+(0.5*min);
        double minang=6*min;
        double ang=Math.abs(hrang-minang);
        ang=Math.min(ang,360-ang);
        System.out.printf("%.2f",ang);
    }
}
