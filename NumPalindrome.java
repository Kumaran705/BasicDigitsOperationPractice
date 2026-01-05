 import java.util.*;
 public class NumPalindrome{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int rev=0;
      int b=a;
      while(b>0){
        int digit=b%10;
        rev+=digit;
        b/=10;
      }
      System.out.println(a==rev);
 }}
