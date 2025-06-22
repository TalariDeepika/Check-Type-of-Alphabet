import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int original = N;
        int reversed = 0;

        // Reverse the number
        while (N > 0) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N = N / 10;
        }

        // Check if palindrome
        if (original != reversed) {
            System.out.println(0);
        } else {
            // Count non-zero digits
            int count = 0;
            int temp = original;
            while (temp > 0) {
                if (temp % 10 != 0) {
                    count++;
                }
                temp = temp / 10;
            }
            System.out.println(count);
        }
    }
}