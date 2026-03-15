import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            char c1=sc.next().charAt(0);
            int num=sc.nextInt();
            if(c1=='L'){
                for(int j=0;j<num;j++){
                    char fi=arr[0];
                    for(int k=0;k<arr.length-1;k++){
                        arr[k]=arr[k+1];
                    }
                    arr[arr.length-1]=fi;
                }
                sb.append(arr[0]);
            }
            else{
                for(int j=0;j<num;j++){
                    char la=arr[arr.length-1];
                    for(int k=arr.length-1;k>0;k--){
                        arr[k]=arr[k-1];
                    }
                    arr[0]=la;
                }
                sb.append(arr[0]);
            }
        }
        String first=sb.toString();
        int len=first.length();
        char a[]=first.toCharArray();
        Arrays.sort(a);
        String sf=new String(a);
        boolean fnd=false;
        for(int i=0;i<=s.length()-len;i++){
            String sub=s.substring(1,i+len);
            char[] b=sub.toCharArray();
            Arrays.sort(b);
            if(sf.equals(new String(b))){
                fnd=true;
                break;
            }
        }
        if(fnd){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
