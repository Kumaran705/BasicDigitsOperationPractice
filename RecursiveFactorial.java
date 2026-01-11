import java.util.*;
public class RecursiveFactorial{
  private static long fact(long n){
        if(n==0||n==1)
            return 1;
      return n*fact(n-1);
  }
        
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        long n=sc.nextLong();
        System.out.println("Factorial of "+n+"is "+fact(n));
        
  }
}
