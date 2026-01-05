import java.util.*;
public class DigitCount{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        System.out.println(count);

    }
} 
