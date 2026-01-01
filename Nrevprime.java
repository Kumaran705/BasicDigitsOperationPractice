import java.util.*;
public class Nrevprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        while(n>0){
            int digit=0;
            digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(rev==a)
            System.out.println(true);
        else
             System.out.println(false);

    }
    
}
