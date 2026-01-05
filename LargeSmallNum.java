import java.util.Scanner;

public class LargeSmallNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int largest = 0;
        int smallest = 9;

        while (a > 0) {
            int digit = a % 10;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
            a /= 10;
        }

        System.out.println(largest);
        System.out.println(smallest);
    }
}
