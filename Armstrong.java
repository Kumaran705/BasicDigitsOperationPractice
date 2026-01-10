import java.util.*;
public class Armstrong{
    boolean ArmstrongCheck(int n){
      int num=n;
      int sum=0; 
      int digits=String.valueOf(n).length();
      while(n>0){
         int digit=n%10;
          sum+=Math.pow(digit,digits);
         n/=10;
      }
     return sum==num;
          
    }
    public static void main(String args[]){
         Scanner  sc=new Scanner(System.in);
         int n=sc.nextInt();
         Armstrong a=new Armstrong();
         System.out.println(a.ArmstrongCheck(n));
    }
}
}
