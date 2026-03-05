  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int cnt=0;
        int sum=0;
        int maxlen=0;
        int res=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                cnt++;
                sum+=a[i];
                flag=true;
            }
            else{
                if(cnt>maxlen){
                    maxlen=cnt;
                    res=sum;
                }
                else if(cnt==maxlen){
                    res+=sum;
                }
                cnt=0;
                sum=0;
            }
        }
        if(cnt>maxlen){
            res=sum;
        }
        else if(cnt==maxlen){
            res+=sum;
        }
        if(!flag)
           System.out.println("-1");
        else
            System.out.println(res);
    }
}
