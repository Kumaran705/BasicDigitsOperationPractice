import java.util.Scanner;

public class PrimeNumberSeries {
    public static boolean PrimeCheck(int num) {
        if (num <= 1) 
             return false;
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) 
                   return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (PrimeCheck(i)) {
                System.out.print(i + " ");
            }
  }
    }

}
