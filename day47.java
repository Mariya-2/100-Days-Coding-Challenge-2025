m=sc.nextLine();
        int n1=num.charAt(0)-'0';
        int n2=num.charAt(1)-'0';
        StringBuilder sb=new StringBuilder();
        StringBuilder sv=new StringBuilder();
        for(int i=0;i<c.length;i++){
            if(i==n1-1){
              sb.append(c[i]);
              char r1=c[i].charAt(0);
              int f=(c[i].length()/2)-1;
              char r2=c[i].charAt(f);
              sb.setCharAt(0,r2);
              sb.setCharAt(f,r1);
              break;
            }
        }
        for(int i=0;i<c.length;i++){
            if(i==n2-1){
              sv.append(c[i]);
              char r1=c[i].charAt(0);
              int f=(c[i].length()/2)-1;
              char r2=c[i].charAt(f);
              if(f%2!=0){
              sv.setCharAt(0,r2);
              sv.setCharAt(f,r1);
              break;
              }
              else{
                  sb.setCharAt(0,r2);
                  char h=c[i].charAt(1);
                  char d=c[i].charAt(f-1);
                  sb.setCharAt(f-1,h);
                  sb.setCharAt(1,d);
                  sb.setCharAt(f,r1);
                  break;
              }
            }
        }
        System.out.print(sb.toString()+" ");
        System.out.println(sv.toString());
    }
}
