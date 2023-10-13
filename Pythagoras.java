import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = in.nextInt();
    }
    int result =0;
    for(int i=0;i<n;i++){
      int r = one(a[i],a,i);
      if(r==1){result+=1;}
    }
    if(result>0){System.out.println("YES");}
    else{System.out.println("NO");}
  }
  public static int one(int a,int[] ar,int val){
    for(int i=0;i<ar.length;i++){
      if(ar[i]!=a){
        int r1 = res(a,ar[i],ar,val);
        if(r1==1){return 1;}
      }
    }
    return 0;
  }
  public static int res(int a,int b,int[] ar,int val){
    for(int i=0;i<ar.length;i++){
      if(ar[i]!=a && ar[i]!=b){
        int c = ar[i]* ar[i];
        if(c == (a*a)+(b*b)){
          return 1;
        }
      }
    }
    return 0;
    }
  }
